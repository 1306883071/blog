package Url;

import java.net.URL;

public class URLTest {
    public static void main(String[] args) throws Exception{
        URL url = new URL("http://tch.ityxb.com/textbook/list");
        System.out.println("协议: "+url.getProtocol());
        System.out.println("主机名: "+url.getHost());
        System.out.println("文件名: "+url.getFile());
        System.out.println("端口号: "+url.getPort());
        System.out.println("引用: "+url.getRef());
        System.out.println("路径: "+url.getPath());

    }
}
