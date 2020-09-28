package com.servlet;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Test;

import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelloJson {
    @Test
    public void test1() {
        Person person = new Person(1, 18, "lin", "男");
        // 创建Gson 对象实例
        Gson gson = new Gson();
        // toJson 方法可以把java 对象转换成为json 字符串
        String personJsonString = gson.toJson(person);
        System.out.println(personJsonString);
        // fromJson 把json 字符串转换回Java 对象
        // 第一个参数是json 字符串
        // 第二个参数是转换回去的Java 对象类型
        Person person1 = gson.fromJson(personJsonString, Person.class);
        System.out.println(person1);
    }

    @Test
    public void text2() {
        Person person = new Person(1, 18, "linhui", "女");
        Gson gson = new Gson();
        String personString = gson.toJson(person);
        System.out.println(personString);
        Person person1 = gson.fromJson(personString, Person.class);
        System.out.println(person1);

    }
    @Test
    public void text3(){
        List<Person> list1=new ArrayList<Person>();
        list1.add(new Person(1,18,"Li","男"));
        Gson gson=new Gson();
        String personString=gson.toJson(list1);
        List<Person> list2=gson.fromJson(personString, new TypeToken<List<Person>>(){
        }.getType());
        Person person1=list2.get(0);
        System.out.println(personString);
        System.out.println(person1);

    }

    public  void text4(){
        Map<Integer,Person> map1=new HashMap<Integer, Person>();
        map1.put(1,new Person(1,18,"Li","男"));
        Gson gson=new Gson();
        String string1=gson.toJson(map1);
        }
    }


