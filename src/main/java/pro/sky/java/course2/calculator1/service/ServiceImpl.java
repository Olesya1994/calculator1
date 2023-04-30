package pro.sky.java.course2.calculator1.service;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
    private int Result;
    private int num1;
   private int num2;
    @Override
    public String getResultMinus(int num1, int num2){
       return num1 + " - "+ num2 +" = "+ (num1-num2);
    }
    @Override
    public String getResultPlus(int num1, int num2) {
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }
    @Override
    public String getResultMultiply(int num1, int num2) {
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }
    @Override
    public String getResultDivide(int num1, int num2){
        return num1 + " / "+ num2 +" = "+ (num1/num2);
    }

}
