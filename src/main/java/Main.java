public class Main {
    public static void main(String[] args) {
        //работа калькулятора напрямую
        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Calculator.Operation.MULT)
                        .result()
        );
        Ints calcInts = new IntsCalculator();
        System.out.println("Суммирование: " + calcInts.sum(2, 3));
        System.out.println("Умножение: " + calcInts.mult(2, 3));
        System.out.println("Возведение в степень:" + calcInts.pow(2, 3));

    }
}
