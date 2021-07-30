package com.train;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String hello="tom.txt";
        System.out.println("文件后缀名"+ StringUtils.substringAfterLast(hello,"tom"));
    }
}
