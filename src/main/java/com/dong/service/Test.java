package com.dong.service;

import java.util.*;

public class Test {
    public  static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String names=input.next();
        String[] nameArr = names.split(",");
        Map<String, Integer> map = new HashMap<>();
        boolean flag = true;
        if(nameArr.length<=0||nameArr.length>=100){
            System.out.println("error.0001");
            flag = false;
        }
        for (int j=0;j<nameArr.length;j++) {
            // 判断每个姓名的大小写
            for(int i=0; i<nameArr[j].length(); i++){
                char c = nameArr[j].charAt(i);
                // 第一个不是大写豁或其他不是小写
                if((i==0&&(c<65 || c >90))||(i>0&&(c<97||c>122))){
                    System.out.println("error.0001");
                    flag = false;
                    break;
                }
            }
            Integer integer = map.get(nameArr[j]);
            map.put(nameArr[j], integer == null?1:integer+1);
        }
        if(flag){
            /*List<Map.Entry<String,Integer>> list = new ArrayList(map.entrySet());
            Collections.sort(list, (o1, o2) -> new Comparator<Map.Entry<String,Integer>>() {
                @Override
                public int compare(Map.Entry<String,Integer> o1, Map.Entry<String,Integer> o2) {
                    if(o1.getValue()==o2.getValue()){
                       // return o1.getKey().compareTo(o2.getKey());
                    }
                    return o1.getValue()-o2.getValue();

                }

            });
            System.out.println(list.get(0).getKey());*/
        }
    }
}
