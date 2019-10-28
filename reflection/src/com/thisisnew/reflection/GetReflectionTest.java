//GetReflectionTest.java

package com.thisisnew.reflection;

import java.lang.reflect.Method;

public class GetReflectionTest {
  public static void main(String[] args) {
	
    String[] nameArr = {"홍길동","임꺽정","아무개","라이언"};
  
    try {
    	ReflectionTest reflectionTest = new ReflectionTest(); //invoke()를 실행하는데 필요한 객체 생성
        Class refClass = Class.forName("com.thisisnew.reflection.ReflectionTest");
        Method[] refMethod = refClass.getDeclaredMethods();
        
        try {
         for(int i=0; i<refMethod.length; i++) {
           if(refMethod[i].getName().equals("setName")) {
             for(int j=0; j<nameArr.length; j++) {
               System.out.println("-----------setName 실행 -----------");
               refMethod[i].invoke(reflectionTest, nameArr[j]); //객체와 매게변수를 넣고 실행
               
               System.out.println("-----------getName 실행 -----------");
               System.out.println(reflectionTest.getName());
             }
           }
         }
        } catch (Exception e) {
           e.printStackTrace();
        }
        
    } catch (ClassNotFoundException e) {
    	e.printStackTrace();
    }
  }
}