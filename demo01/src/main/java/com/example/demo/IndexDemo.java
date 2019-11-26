package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IndexDemo {
    public static final String abc = "sdss";



    public static void main(String[] args) {



        try {
            ArrayList<String> list = new ArrayList<>();
            for (String s : list) {

            }

            for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
                String next =  iterator.next();

            }

            for (int i = 0; i < args.length; i++) {
                String arg = args[i];

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //本地修改123

        ArrayList<String> lis2t = new ArrayList<>();

        ArrayList<String> list3 = new ArrayList<>();

        // 远程修改 5657   33333
        // 远程修改 5657   9999
        List list4;

    }

}
