package pro.sky.java.course2.calculator1.service;

import org.springframework.web.bind.annotation.RequestParam;

public interface Service {

    String getResultMinus( int num1, int num2);
    String getResultPlus(int num1, int num2);
    String getResultMultiply(int num1, int num2);
    String getResultDivide(int num1, int num2);
}
