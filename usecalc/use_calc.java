package usecalc;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class use_calc {
    public static void main(String[] args) {

    }
    public static List<String>exp2List(String exp){
        List<String> ls = new ArrayList<>();
        int i = 0;
        char c;
        String str;
        do{
            if((c=exp.charAt(i))<48||((c=exp.charAt(i))>57)){
                ls.add(c+"");
                i++;
            }else {
                str="";
                while(i<exp.length()&&(c=exp.charAt(i))>=48&&((c=exp.charAt(i))<=57)){
                    str+=c;
                    i++;
                }
                ls.add(str);
            }
        }while(i<exp.length());
        return ls;
    }


    public static List<String> toBackExp(List<String> ls){
        Stack<String> s1 = new Stack<String>();
        List<String> s2 = new ArrayList<String>();
        for(String item : ls){
            if(item.matches("\\d+")){
                s2.add(item);
            }else if(item.equals("(")){
                s1.push(item);
            }else if(item.equals(")")){
                while(!s1.peek().equals("(")){
                    s2.add(s1.pop());
                }
                s1.pop();
            }else{
             while(s1.size()!=0&&use_calc.vsOper(item)<use_calc.vsOper(s1.peek())){
                    s2.add(s1.pop());
             }
                s1.push(item);
            }
        }
        while(s1.size()!=0){
            s2.add(s1.pop());
        }
        return s2;
}
    public static String cal(List<String> ls) throws Exception{
    Stack<String> stack = new Stack<String>();
    for(String item : ls) {
        if(item.matches("\\d+")){
            stack.push(item);
        }else{
            int num2 = Integer.parseInt(stack.pop());
            int num1 = Integer.parseInt(stack.pop());
            int res = 0;
            if(item.equals("+")){
                res = num1 + num2;
            }else if (item.equals("-")) {
                res = num1 - num2;
            }else if(item.equals("*")) {
                res = num1 * num2;
            }else if(item.equals("/")) {
                if(num2==0){
                    throw new Exception("分母不能为0");
                }else {
                    res = num1 / num2;
                }
            }else{
                throw new RuntimeException("运算符有误");
            }
            stack.push(""+res);
        }
    }
    return stack.pop();
    }
    public static int vsOper(String oper) {
        switch (oper) {
            case "+":
                return 1;
            case "-":
                return 1;
            case "*":
                return 2;
            case "/":
                return 2;
            default:
                return -1;
        }
    }
}