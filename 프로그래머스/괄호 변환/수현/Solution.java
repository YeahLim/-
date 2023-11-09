/*
    걸린 시간 : 34분
    tlrks
*/

import java.util.*;

class Solution {
    public String solution(String p) {
        return makeBalancedString(p);
    }
    
    public String makeBalancedString(String str){
        if(str.equals("")){
            return "";
        }

        //균형잡힌 괄호 문자열 찾기
        int leftCount = 0;
        int rightCount = 0;
        String u= "";
        String v= "";
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '('){
                leftCount++;
            }else if(str.charAt(i) == ')'){
                rightCount++;
            }
            //가장 첫번째로 괄호의 개수가 같으면 가장 짧은 균형잡힌 괄호 문자열
            if(leftCount == rightCount){
                u = str.substring(0,i+1);
                if(i+1 < str.length()){
                    v = str.substring(i+1,str.length());
                }
                break;
            }
        }
        String balancedStr = "";
        System.out.println("u : "+u+" v : "+v);
        
        //u가 올바른 괄호인경우
        if(checkRightString(u)){
            balancedStr = u + makeBalancedString(v);
        }
        //u가 올바른 괄호가 아닌경우
        else{
            balancedStr = "(";
            balancedStr += makeBalancedString(v);
            balancedStr += ")";
            
            u = u.substring(1,u.length()-1);
            
            //괄호 뒤집기
            for(int i=0;i<u.length();i++){
                if(u.charAt(i) == '('){
                    balancedStr+=')';
                }else if(u.charAt(i) == ')'){
                    balancedStr+='(';
                }
            }
        }
        
        return balancedStr;
    }
    //올바른 괄호인지 확인하는 메소드
    public boolean checkRightString(String str){
        Stack<Character> stack = new Stack();
        
        for(int i=0;i<str.length();i++){
            char blanket =str.charAt(i);
            
            //( 경우
            if(blanket == '('){
                stack.add(blanket);
            }
            //) 경우
            else if(stack.size() !=0 && stack.peek() == '('){
                stack.pop();
            }else{
                return false;   
            }
        }
        
        if(stack.size() == 0){
            return true;
        }
        
        return false;
    }
}
