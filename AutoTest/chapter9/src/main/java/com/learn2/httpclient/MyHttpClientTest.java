package com.learn2.httpclient;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class MyHttpClientTest {

    @Test
    public void  testRequest() throws IOException {

        String result;
        //get请求
        HttpGet get = new HttpGet("http://www.baidu.com");

        //获取客户端client
        HttpClient client  = new DefaultHttpClient();

        //客户端执行get请求
        HttpResponse response = client.execute(get);

        //使用EntityUtils.toString() 将返回结果转化为String，注意字符编码设置下
        result = EntityUtils.toString(response.getEntity(),"utf-8");

        //打印结果
        System.out.println(result);

    }
}
