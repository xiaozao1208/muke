package com.learn2.httpclient.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class GetRequest {

    private String url;
    //这个读取application.properties中的文件
    private ResourceBundle bundle;
    //用来存储cookies信息的store
    private CookieStore store;


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
        /**
         * 此处是DefaultHttpClient，不是HttpClient 这个地方的写法注意
         * 否则下面这个会报错CookieStore store = client.getCookieStore();
         */
        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse reponse =client.execute(get);

        //此处的结果是String类型
        result= EntityUtils.toString(reponse.getEntity(),"utf-8");
        System.out.println(result);

        //获取cookies信息
        //CookieStore store = client.getCookieStore();
        this.store =client.getCookieStore();
        List<Cookie> cookieList = store.getCookies();

        for(Cookie cookie : cookieList){
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println("cookie的名字："+name+"; cookie的值是："+value);

        }

    }

    @Test(dependsOnMethods = "testGetCookies")
    public void getWithCookies() throws IOException {
        //获取配置文件中的地址
        String uri = bundle.getString("getWithCookies.uri");
        String testUrl= this.url+uri;

        //测试逻辑的书写
        HttpGet get = new HttpGet(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();

        //设置cookies
        client.setCookieStore(this.store);
        HttpResponse response = client.execute(get);

        //获取响应状态码
        String result;
        int statusCode = response.getStatusLine().getStatusCode();
        System.out.println("statusCode="+statusCode);

        if(statusCode == 200){
            result = EntityUtils.toString(response.getEntity(),"utf-8");
            System.out.println(result);
        }
    }

}
