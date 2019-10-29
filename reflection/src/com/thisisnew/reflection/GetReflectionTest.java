//GetReflectionTest.java

package com.thisisnew.reflection;

import java.lang.reflect.Field;

public class GetReflectionTest {
  public static void main(String[] args) {

    try {
        ReflectionTest reflectionTest = new ReflectionTest(); 
        Class refClass = Class.forName("com.thisisnew.reflection.ReflectionTest");
        Field[] refField = refClass.getDeclaredFields();
        
        try {
         for(int i=0; i<refField.length; i++) {
           if(refField[i].getName().equals("name")) {
             Field field = refClass.getDeclaredField(refField[i].getName());
             field.setAccessible(true);
             
             field.set(reflectionTest, "Thisisnew"); // 값 설정
             Object fieldValue = field.get(reflectionTest);// 값 받아오기
             System.out.println(fieldValue);
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