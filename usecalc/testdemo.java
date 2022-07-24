package usecalc;

import java.util.List;

public class testdemo {
    public static void main(String[] args) throws Exception {
        String exp1 = "35+(5+1*8)";
        List<String> middleExoList = use_calc.exp2List(exp1);
        List<String> backExp = use_calc.toBackExp(middleExoList);
        System.out.println(use_calc.cal(backExp));
        String exp2 = "6/0";
        List<String> middleExoList2 = use_calc.exp2List(exp2);
        List<String> backExp2 = use_calc.toBackExp(middleExoList2);
        System.out.println(use_calc.cal(backExp2));
    }

}
