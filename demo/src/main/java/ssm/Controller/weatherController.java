package ssm.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class weatherController {
	
	
    public void testetWeatherInfo(){
        //��������Ԥ����Ϣ
        String u="http://mobile.weather.com.cn/data/sk/101010100.html";
        //String info=WeatherUtil.getWeatherInfo(u);
        //���
        //System.out.println("info:"+info);
    }
 

/**
 * @author hh
 */
public class WeatherUtil {
   
//    public static String getWeatherInfo(String urlPath){
//        //ƴ�ӽ��յ���Ϣ
//        StringBuffer info=new StringBuffer();
//        //��ȡÿ�е�����
//        String inputline="";
//        try {
//            //ʵ����URL����
//            URL url= new URL(urlPath);
//            //��ȡӦ�ó���� URL ֮���ͨ������
//            HttpURLConnection conn=(HttpURLConnection) url.openConnection();
//            // ���󷽷�
//            conn.setRequestMethod("GET");
//            //��ȡurl����Դ������
//            InputStreamReader inReader=new InputStreamReader(conn.getInputStream(),"utf-8");
//            //��ȡ�����ַ�������
//            BufferedReader bufferedReader=new BufferedReader(inReader);
//            //��ȡÿ�����ݣ�ͬʱ��ֵ���ж��Ƿ�Ϊ�գ�
//            while((inputline=bufferedReader.readLine())!=null){
//                //�����Ϣ
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
