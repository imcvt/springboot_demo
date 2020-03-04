package com.imc.controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * @author luoly
 * @date 2018/10/20 18:08
 * @description
 */
public class Test {

    public static void main(String[] args) {
        String s = "/D:/WEAVER/Resin/weaver/formmode/customjavacode/modeexpand/CustomJavaCode_20180115092308.class";
        System.out.println(s.replace("Resin", "ecology/classbean"));

        String url = "http://10.21.64.23/pre-register?country=South%20Africa&6websiteId=1006&campaignId=100028065941&campaignName=ab%20c";
        String url1 = "http://101.69.241.50:2380/pre-register?country=South Africa&websiteId=1006&campaignId=100028166907&campaignName=rtet";
        System.out.println(url1.substring(1));
        try {
            url = URLDecoder.decode(url, "UTF-8");
            System.out.println(url);
            url1 = URLEncoder.encode("tytry", "utf-8").replaceAll("\\+", "%20");
            System.out.println(url1);
            System.out.println(URLDecoder.decode(url1, "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
