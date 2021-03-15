package calcInterfaceExample;

public class Calc {
    CalcI<Integer> add = (a, b, op) -> a + b;
    CalcI<Integer> subtract = (a, b, op) -> a - b;
    CalcI<Float> multiply = (a, b, op) -> a * b;
    CalcI<Float> divide = (a, b, op) -> a / b;
}
