package com.company;

import java.util.Properties;

public class ZooOptions {
    public static void main(String[] args) {
        var prop = new Properties();
        prop.setProperty("name", "Our Zoo");
        prop.setProperty("open", "10am");

        System.out.println(prop.getProperty("camel"));
        System.out.println(prop.getProperty("camel", "BOB"));//BOB
        System.out.println(prop.getProperty("name", "BOB"));//BOB

        prop = new Properties();
        prop.put("tigerAge", 4);
        prop.put("lionAge", 5);
        System.out.println(prop.getProperty("tigerAge"));//null
        System.out.println(prop.getProperty("lionAge"));//null
        System.out.println(prop.get("tigerAge"));//4
        System.out.println(prop.get("lionAge"));//4
    }
}
