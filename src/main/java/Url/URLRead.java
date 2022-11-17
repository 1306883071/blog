package Url;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class URLRead {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.hao123.com"); //根 据网址创建URL对象//创建输入流:从URL中取出输入流
        InputStreamReader is = new InputStreamReader(url.openStream());
        BufferedReader buff = new BufferedReader(is);//创建缓冲流
        String inputLine;//定义输入字符串
        while( (inputLine=buff.readLine()) != null){ //分行读取网页文档信息
            System.out. println(inputLine); //显示文档内容
        }
        buff.close();
        is.close();
    }
}