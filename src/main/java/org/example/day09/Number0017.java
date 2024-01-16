package org.example.day09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Number0017 {
    List<String> res = new ArrayList<>();
    // 记录回溯算法的递归路径


    public static void main(String[] args) {
        Number0017 t = new Number0017();
        String digits = "23";
        List<String> list = t.letterCombinations(digits);
        for (String string : list) {
            System.out.println(string);
        }
    }

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return res;
        }
        //初始对应所有的数字，为了直接对应2-9，新增了两个无效的字符串""
        String[] numString = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        backtrack(digits,numString,0);
        return res;
    }

    StringBuilder sb = new StringBuilder();

    void backtrack(String digits, String[] numString, int num) {
        // base case
        if (num == digits.length()) {
            res.add(sb.toString());
            return;
        }

        String str = numString[digits.charAt(num) - '0'];

        // 回溯算法标准框架
        for (int i = 0; i < str.length(); i++) {
           sb.append(str.charAt(i)) ;
           backtrack(digits, numString, num + 1);
           sb.deleteCharAt(sb.length()-1);
        }
       
    }
        
    
}
