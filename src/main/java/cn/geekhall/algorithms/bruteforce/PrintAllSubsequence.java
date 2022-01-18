package cn.geekhall.algorithms.bruteforce;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequence {
    /**
     * 递归打印子字符串
     * @param s
     * @return
     */
    public static List<String> subs(String s) {
        char[] str = s.toCharArray();
        String path = "";
        List<String> ans = new ArrayList<>();
        process(str, 0 , ans, path);
        return ans;
    }

    /**
     * 递归打印子字符串
     * @param str
     * @param index
     * @param ans
     * @param path
     */
    public static void process(char[] str, int index, List<String> ans, String path) {
//        System.out.println(index + path);
        if (index == str.length) {
            ans.add(path); // 沿途所形成的答案放入ans中
            return;
        }
        String no = path;
        process(str, index + 1, ans, no);//index此时来到的位置，要or不要

        String yes = path + String.valueOf(str[index]);
        process(str, index + 1, ans, yes);//index此时来到的位置，要or不要
    }

    public static void main(String[] args) {
        System.out.println(subs("abc"));
    }
}
