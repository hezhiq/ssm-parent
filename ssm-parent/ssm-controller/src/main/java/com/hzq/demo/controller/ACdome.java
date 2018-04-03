package com.hzq.demo.controller;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.collection.AhoCorasick.AhoCorasickDoubleArrayTrie;
import com.hankcs.hanlp.dictionary.BaseSearcher;
import com.hankcs.hanlp.dictionary.CoreDictionary;
import com.hankcs.hanlp.dictionary.CustomDictionary;

import java.util.*;

/**
 * Created by zhengxgs on 2018/3/22.
 */
public class ACdome {

    /**
     * 演示用户词典的动态增删
     *
     * @author hankcs
     */
    public static void main(String[] args)
    {
        Set<Integer> set = new HashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        Iterator it = set.iterator();
        while (it.hasNext()){
            Integer j = (Integer) it.next();
            if(j == 2){
                it.remove();
            }
        }
        set.add(4);

    }

}