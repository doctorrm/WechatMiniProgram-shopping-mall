package yMybatis;

import java.io.IOException;

import org.yi.po.Order;
import org.yi.po.OrderInfo;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GoodOne {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		String teString="[{\"cartId\":8,\"goodId\":2,\"goodName\":\"2017春装韩范淑女甜美气质ol长袖衬衫女蕾丝花边高领加绒打底衬衣-淘宝网\",\"goodPrice\":134,\"goodMainUrl\":\"http://127.0.0.1:8080/images/2017春装韩范淑女甜美气质ol长袖衬衫女蕾丝花边高领加绒打底衬衣-淘宝网/main.jpg\",\"goodDetailUrls\":\"http://127.0.0.1:8080/images/2017春装韩范淑女甜美气质ol长袖衬衫女蕾丝花边高领加绒打底衬衣-淘宝网/main.jpg\",\"selected\":true,\"num\":1},{\"cartId\":9,\"goodId\":4,\"goodName\":\"工厂直销防晒衣女中长款雪纺开衫2017夏韩版空调衫短袖大码薄外套-淘宝网\",\"goodPrice\":32,\"goodMainUrl\":\"http://127.0.0.1:8080/images/工厂直销防晒衣女中长款雪纺开衫2017夏韩版空调衫短袖大码薄外套-淘宝网/main.jpg\",\"goodDetailUrls\":\"http://127.0.0.1:8080/images/[九平米]藏文藏传佛教t恤观音清心咒六字大明咒密教福德智慧平安-淘宝网/1.jpg,http://127.0.0.1:8080/images/[九平米]藏文藏传佛教t恤观音清心咒六字大明咒密教福德智慧平安-淘宝网/2.jpg,http://127.0.0.1:8080/images/[九平米]藏文藏传佛教t恤观音清心咒六字大明咒密教福德智慧平安-淘宝网/3.jpg,http://127.0.0.1:8080/images/[九平米]藏文藏传佛教t恤观音清心咒六字大明咒密教福德智慧平安-淘宝网/4.jpg,http://127.0.0.1:8080/images/[九平米]藏文藏传佛教t恤观音清心咒六字大明咒密教福德智慧平安-淘宝网/5.jpg,http://127.0.0.1:8080/images/[九平米]藏文藏传佛教t恤观音清心咒六字大明咒密教福德智慧平安-淘宝网/6.jpg,http://127.0.0.1:8080/images/[九平米]藏文藏传佛教t恤观音清心咒六字大明咒密教福德智慧平安-淘宝网/7.jpg,http://127.0.0.1:8080/images/[九平米]藏文藏传佛教t恤观音清心咒六字大明咒密教福德智慧平安-淘宝网/8.jpg,http://127.0.0.1:8080/images/[九平米]藏文藏传佛教t恤观音清心咒六字大明咒密教福德智慧平安-淘宝网/9.jpg,http://127.0.0.1:8080/images/[九平米]藏文藏传佛教t恤观音清心咒六字大明咒密教福德智慧平安-淘宝网/10.jpg,http://127.0.0.1:8080/images/[九平米]藏文藏传佛教t恤观音清心咒六字大明咒密教福德智慧平安-淘宝网/11.jpg,http://127.0.0.1:8080/images/[九平米]藏文藏传佛教t恤观音清心咒六字大明咒密教福德智慧平安-淘宝网/12.jpg,http://127.0.0.1:8080/images/[九平米]藏文藏传佛教t恤观音清心咒六字大明咒密教福德智慧平安-淘宝网/13.jpg\",\"selected\":true,\"num\":1}]";
		teString=teString.replace("\\", "");
		System.out.println("testring:"+teString);
//		testtest(teString);
		
		/*String bb="sdfsd\\asdfs\\df";
		System.out.println(teString.replace("\\", ""));		*/
		
	}
	public static void testtest(String jsontest) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		OrderInfo[] arr = mapper.readValue(jsontest, OrderInfo[].class);
		System.out.println(arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getGoodName());
			System.out.println(arr[i].getGoodMainUrl());
			System.out.println(arr[i].getNum());
		}
	}
}