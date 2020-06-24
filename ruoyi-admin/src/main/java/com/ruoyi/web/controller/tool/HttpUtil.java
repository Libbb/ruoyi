package com.ruoyi.web.controller.tool;



import com.alibaba.fastjson.JSONObject;
import com.ruoyi.framework.web.domain.server.Sys;
import com.ruoyi.system.domain.Order;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: xsy
 * @create: 2020-06-22 16:36
 * 请求远程接口
 **/

public class  HttpUtil {
    /**
     *
     * post请求
     *
     * 银行接口数据获取
     */
    public static JSONObject sendPost(String vehicleNum, String vehicleVin, String vehicleEngine, String userPhone){
        //创建连接对象
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        //post请求
        HttpPost httpPost = new HttpPost("http://175.24.130.173:8001/record/select?vehicleNum="+vehicleNum+"&vehiceVin="+vehicleVin+"&vehicleEngine="+vehicleEngine+"&userPhone="+userPhone);

        try {
            //请求报文，参数格式
            httpPost.addHeader("Content-type","application/x-www-form-urlencoded");

            //发送请求
            HttpResponse response = httpClient.execute(httpPost);
            System.out.println("接口地址"+httpPost);
            System.out.println("获取返回服务器的状态码：----- "+response.getStatusLine().getStatusCode());

            if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
                //成功后响应数据
                String result = EntityUtils.toString(response.getEntity());
                JSONObject json = JSONObject.parseObject(result);
                System.out.println("接口返回数据："+json.toString());
                return json;
            }

        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                //释放连接
                if(httpClient != null){
                    httpClient.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return new JSONObject();

    }












}
