package com.coderyu;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Exercise17002 {
    public static void main(String[] args){
        Map countryMap=new HashMap();
        countryMap.put("CHINA","北京");
        countryMap.put("USA","华盛顿");
        countryMap.put("JAPAN","东京");
        countryMap.put("RUSSIA","莫斯科");
        System.out.println(countryMap);

        Set cityList=new LinkedHashSet();
        for(Object key:countryMap.keySet()){
            cityList.add(countryMap.get(key));
        }
        System.out.println(cityList);
    }
}
