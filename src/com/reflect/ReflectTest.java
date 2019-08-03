package com.reflect;

import com.sun.org.apache.xpath.internal.operations.String;

import java.lang.reflect.Field;
import java.sql.Connection;

public class ReflectTest {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("com.entity.User");
            Object o = clazz.newInstance();
            Field name = clazz.getField("name");
            System.out.println(name.get(o));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }
}


