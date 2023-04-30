package pro.sky.java.course2.calculator1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.calculator1.service.Service;

@RestController
public class FirstController {
    private Service service;

    public FirstController(Service service) {
        this.service = service;
    }

    @GetMapping
    public String showHelloWorld() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping("/plus")
    public String showResultPlus(@RequestParam int num1, @RequestParam int num2) {
      return service.getResultPlus(num1, num2);
    }

    @GetMapping("/minus")
    public String showResultMinus(@RequestParam int num1, @RequestParam int num2) {
        return service.getResultMinus(num1, num2);
    }
    @GetMapping("/multiply")
    public String showResultMultiply(@RequestParam int num1, @RequestParam int num2) {
        return service.getResultMultiply(num1, num2);
    }
    @GetMapping("/divide")
    public String showResultDivide(@RequestParam int num1, @RequestParam int num2) {
        return service.getResultDivide(num1, num2);
    }
}
