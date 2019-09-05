package com.hensu.javapractise.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Scanner;

/**
 * @Author: sh
 * @Description: HttpClientApache
 * @Date: 15:16 2019/9/5
 */

//@Slf4j
@Log4j2
public class HttpClientApache {

    private static final CloseableHttpClient closeableHttpClient = HttpClients.createDefault();

    /**
     * apache httpclient get
     * @return
     */
    public static String getReq() {
        HttpResponse httpResponse = null;
        HttpGet httpGet = null;
        try {
            httpGet = new HttpGet("http://212.64.49.50:8081/wechat/orders/20190820160833980874e61d8c0b74c8");
            httpResponse = closeableHttpClient.execute(httpGet);
            InputStream con = httpResponse.getEntity().getContent();
            Scanner scanner = new Scanner(con);
            System.out.println(httpResponse.getStatusLine());
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
            return null;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                ((CloseableHttpResponse) httpResponse).close();
                httpGet.releaseConnection();
                closeableHttpClient.close();

            } catch (Exception e) {

            }
        }
        return null;
    }

    /**
     * apache httpclient post
     * @param url
     * @param json
     * @return
     */
    public static String postReq(String url, String json) {
        HttpPost httpPost = null;
        HttpResponse response = null;
        try {
            httpPost = new HttpPost(url/*"http://212.64.49.50:8081/hnseal/loginInfo"*/);
            httpPost.setHeader("Content-type", "application/json; charset=utf-8");
            httpPost.setHeader("Connection", "Close");
            // 构建消息实体
            StringEntity entity = new StringEntity(json, Charset.forName("UTF-8"));
            entity.setContentEncoding("UTF-8");
            // 发送Json格式的数据请求
            entity.setContentType("application/json");
            httpPost.setEntity(entity);
            Long st = System.currentTimeMillis();
            response = closeableHttpClient.execute(httpPost);
            log.info("postReq()请求耗时==="+(System.currentTimeMillis()-st)+"毫秒");
            HttpEntity httpEntity = response.getEntity();
            String result = null;
            if (httpEntity != null) {
                try {
                    result = EntityUtils.toString(httpEntity);
                    log.info("postReq()请求结果==="+result);
                    return result;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e) {

        } finally {
            if (response != null) {
                try {
                    ((CloseableHttpResponse) response).close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (httpPost != null) {
                try {
                    httpPost.releaseConnection();
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (closeableHttpClient != null) {
                try {
                    closeableHttpClient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    /**
     * jdk原生POST请求，效率高于apache httpcliet post
     * @param postUrl
     * @param json
     * @return
     */
    public static String jdkPostSend(String postUrl,String json){
        JSONObject respJson = null;
        HttpURLConnection httpURLConnection = null;
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            URL url = new URL(postUrl);
            httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Accept", "application/json");
            httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
            // 发送POST请求参数
            Long st = System.currentTimeMillis();
            out = new PrintWriter(httpURLConnection.getOutputStream());
            out.write(json);
            out.flush();
            if (httpURLConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                StringBuffer content = new StringBuffer();
                String tempStr = null;
                in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                log.info("jdkPostSend()请求耗时==="+(System.currentTimeMillis()-st)+"毫秒");
                while ((tempStr = in.readLine()) != null) {
                    content.append(tempStr);
                }

                respJson = JSON.parseObject(content.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) {
                    out.close();
                }
                if (in != null) {
                    in.close();
                }
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
            } catch (Exception e) {
            }
        }
        log.info("jdkPostSend()请求结果==="+respJson.toJSONString());
        return respJson.toJSONString();
    }

    public static void main(String[] args) {
//        getReq();
        String json = "bbh/s/Rpp4AJfg+VcW+KoNyFWZPkHv5E0BWwmvfbcNT5wvkVIrMStCGI8JEdqKkKgz7kT6w2cq7VXEq3kxTLhs/iiax+Nz9A8OkK927NJAFXu7KGcFJXmUGtfYIW1ZWSkAjd7zrln50k6biHgRGhs2LElD9DhiFF30ODhYV4ei9WdZFGVPEgINN7wPTZ44h7ut/dGOUnnQYODVixQefN+HpQkrsTILKZssoZX2JKhhzKrAJgXC4LZJt1M9fTpwIv";
        String postUrl = "http://212.64.49.50:8081/hnseal/loginInfo";
//        String result = postReq(postUrl, json);
//        System.out.println(result);
        System.out.println(jdkPostSend(postUrl,json));
    }
}
