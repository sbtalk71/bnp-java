package com.demo.anotations;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws Exception {
		UseAnnotation an=new UseAnnotation();
		
		Method method=an.getClass().getMethod("display");
		if(method.isAnnotationPresent(Info.class)) {
		Info info=method.getAnnotation(Info.class);
		
		System.out.println(info.descriprion()+" and "+info.name());
		}
		

	}

}
