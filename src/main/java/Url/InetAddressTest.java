package Url;

import java.net.InetAddress;

public class InetAddressTest {
    public static void main(String[] args) throws Exception{//获得当前本地主机的IP地址
        InetAddress add1 = InetAddress.getLocalHost();
        System.out.println( "本机IP地址: "+ add1.getHostAddress() );
        System.out.println( "本机主机名: " + add1.getHostName() );//根据域名，通过DNS域名解析，获得相应服务的主机地址
                InetAddress add2 = InetAddress.getByName( "www.163.com" );
        System.out.println("网易IP地址: "+ add2.getHostAddress());
        System.out.println("网易主机名: " + add2.getHostName());
        System.out.println("3秒可达: " + add2.isReachable(3000));//根据字符串形式IP地址获得相应的IP地址(如果有的话)
        InetAddress add3 = InetAddress.getByName( "192.168.0.22" );
        System.out.println("IP地址为192.168.0.22的主机: "+ add3);
    }
}
