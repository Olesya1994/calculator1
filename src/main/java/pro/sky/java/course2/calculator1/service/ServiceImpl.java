package pro.sky.java.course2.calculator1.service;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
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
    public String getResultDivide(int num1, int num2) throws IllegalArgumentException {
        if (num2 == 0) {
            throw new IllegalArgumentException("Введите значение отличное от 0");
        } else {
            return num1 + " / " + num2 + " = " + (num1 / num2);
        }
    }
}
