package com.hzq.demo.controller;

import com.hankcs.algorithm.AhoCorasickDoubleArrayTrie;
import com.hzq.demo.model.Student;
import com.hzq.demo.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.*;


/**
 * Created by zhengxgs on 2018/1/10.
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView view = new ModelAndView("/index");
        Student student = new Student();
        student.setId(1);
        student = studentService.findAllStudent(student);
        view.addObject("student",student);
        return view;
    }

    public static void main(String[] args) {
        // Collect test data set
        TreeMap<String, String> map = new TreeMap<String, String>();
        String[] keyArray = new String[]
                {
                        "hers",
                        "his",
                        "she",
                        "he",
                        "aa",
                        "bb",
                        "cc"
                };
        for (String key : keyArray)
        {
            map.put(key, key);
        }
        // Build an AhoCorasickDoubleArrayTrie
        AhoCorasickDoubleArrayTrie<String> acdat = new AhoCorasickDoubleArrayTrie<String>();
        acdat.build(map);
        // Test it
        String text = "uheshehersbaabbbbherscc";
        final StringBuffer sb = new StringBuffer();
        sb.append(text);
        final List<AhoCorasickDoubleArrayTrie<String>.Hit<String>> wordList = acdat.parseText(text);
        Collections.sort(wordList, new Comparator<AhoCorasickDoubleArrayTrie<java.lang.String>.Hit<String>>() {
            @Override
            public int compare(AhoCorasickDoubleArrayTrie<String>.Hit<String> o1, AhoCorasickDoubleArrayTrie<String>.Hit<String> o2) {
                return  o2.value.length()-o1.value.length();
            }
        });
        System.out.println(wordList);
//        Set<String> keyWords = new HashSet<String>();
//        for (AhoCorasickDoubleArrayTrie<String>.Hit<String> word : wordList) {
//            String str = null;
//            if(keyWords.size() > 0){
//                for(String keyWord : keyWords){
//                    if(!keyWord.contains(word.value)){
//                        str = word.value;
//                    }
//                }
//            }else {
//                keyWords.add(word.value);
//            }
//            if(str != null){
//                keyWords.add(str);
//            }
//            if(keyWords.size() >= 4){
//                break;
//            }
//        }
//        for(String set : keyWords){
//            System.out.println("set="+set);
//            text = text.replaceFirst(set,"<a>"+set+"</a>");
//        }
//        System.out.println("我是text=" + text);
//        for(AhoCorasickDoubleArrayTrie<String>.Hit<String> word : wordList){
//            String w = word.value;
//            if(keyWords.size() == 0){
//                keyWords.add(w);
//            }
//            String str = null;
//            if(keyWords.size() <= 3){
//                Iterator it = keyWords.iterator();
//                while (it.hasNext()){
//                    String s = (String) it.next();
//                    if(w.length() > s.length() && w.contains(s)){
//                        it.remove();
//                        str = w;
//                    }else if(!s.contains(w)){
//                        str = w;
//                    }
//                }
//            }
//            if(str != null){
//                keyWords.add(str);
//            }
//            if(keyWords.size() > 3){
//                break;
//            }
//
//        }


//            acdat.parseText(text, new AhoCorasickDoubleArrayTrie.IHitCancellable<String>()
//            {
//                @Override
//                public boolean hit(int begin, int end, String value)
//                {
//                    System.out.printf("[%d:%d]=%s\n", begin, end, value);
//                    sb.insert(begin,"<a>").insert(end+"<a>".length(),"</a>");
//                    System.out.println("我是最终的sb="+sb);
//                    return false;
//                }
//            });
        StringBuffer a = new StringBuffer().append("深圳adfsafasdfsad深圳bb");
        a.replace(15,17,"啊啊啊啊啊");
        System.out.println(a);

    }

}