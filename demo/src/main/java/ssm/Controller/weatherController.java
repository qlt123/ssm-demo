package ssm.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class weatherController {
	
	
    public void testetWeatherInfo(){
        //北京天气预报信息
        String u="http://mobile.weather.com.cn/data/sk/101010100.html";
        //String info=WeatherUtil.getWeatherInfo(u);
        //输出
        //System.out.println("info:"+info);
    }
 

/**
 * @author hh
 */
public class WeatherUtil {
   
//    public static String getWeatherInfo(String urlPath){
//        //拼接接收的信息
//        StringBuffer info=new StringBuffer();
//        //读取每行的数据
//        String inputline="";
//        try {
//            //实例化URL对象
//            URL url= new URL(urlPath);
//            //获取应用程序和 URL 之间的通信链接
//            HttpURLConnection conn=(HttpURLConnection) url.openConnection();
//            // 请求方法
//            conn.setRequestMethod("GET");
//            //获取url的资源输入流
//            InputStreamReader inReader=new InputStreamReader(conn.getInputStream(),"utf-8");
//            //获取缓冲字符输入流
//            BufferedReader bufferedReader=new BufferedReader(inReader);
//            //读取每行数据（同时赋值，判断是否为空）
//            while((inputline=bufferedReader.readLine())!=null){
//                //添加信息
//                info.append(inputline);
//            }
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return info.toString();
//    }
}

}
