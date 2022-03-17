public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b); // Ошибка в результате деления на ноль.
        int d = calc.multiply.apply(3, 3);
        calc.println.accept(c);

        calc.println.accept(d);
    }
}