package com.learn2.httpclient.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class PostRequest {
    private String url;
    private ResourceBundle bundle;
    //这个读取application.properties中的文件
    private CookieStore store;
    //用来存储cookies信息的store

    @BeforeTest
    public void beforeTest(){
        bundle = ResourceBundle.getBundle("application", Locale.CHINA);
        url =bundle.getString("test.uri");
    }


    @Test
    public void testGetCookies() throws IOException {
        String result;
        //从配置文件中 拼接测试的url
        String uri = bundle.getString("getCookies.uri") ;
        String testUrl =this.url+uri;

        //测试逻辑的书写
        HttpGet get =new HttpGet(testUrl);
        //此处是DefaultHttpClient，不是HttpClient 这个地方的写法注意
        //否则下面这个会报错CookieStore store = client.getCookieStore();
        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse reponse =client.execute(get);

        result= EntityUtils.toString(reponse.getEntity(),"utf-8");
        System.out.println(result);

        //获取cookies信息
        this.store = client.getCookieStore();
        List<Cookie> cookieList = store.getCookies();

        for(Cookie cookie : cookieList){
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println("cookie的名字："+name+"; cookie的值是："+value);

        }

    }


    @Test(dependsOnMethods = "testGetCookies")
    public void postWithCookies() throws IOException {
        //拼接测试地址
        String uri = bundle.getString("postWithCookies.uri");
        String testUrl= this.url+uri;

        //测试逻辑书写
        //post请求和client对象
        HttpPost post = new HttpPost(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();

        //post请求放请求参数
        JSONObject param = new JSONObject();
        param.put("name","lijuan");
        param.put("age","18");

        //设置请求头信息
        post.setHeader("content-type","application/json");

        //将参数添加到方法中
        StringEntity  entity = new StringEntity(param.toString(),"utf-8");
        post.setEntity(entity);

        //设置cookies信息
        String result;
        client.setCookieStore(this.store);

        //执行测试方法
        HttpResponse response = client.execute(post);

        //获取响应结果
        result = EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);
        //将返回的响应结果 字符串 转化为 json对象；
        JSONObject resultJson = new JSONObject(result);

        //获取到结果值 这个是实际值
        String success = (String) resultJson.get("lijuan");
        String status = (String) resultJson.get("status");

        //具体的判断返回的结果的值
        Assert.assertEquals(success,"success");
        Assert.assertEquals(status,"1");
    }

}
