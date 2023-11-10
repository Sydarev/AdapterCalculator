package org.example;

public class Main {
    public static void main(String[] args) {
//        Calculator calc = new Calculator();
//        System.out.println(calc.newFormula()
//                .addOperand(100)
//                .addOperand(2)
//                .calculate(Calculator.Operation.POW)
//                .result()
//        );

        Ints calc = new IntsCalculator();
        System.out.println("Результат сложения: " + calc.sum(2, 2));
        System.out.println("Результат возведения в степень:" + calc.pow(10, 3));
        System.out.println("Результат умножения:" + calc.mult(10, 10));
    }
}
