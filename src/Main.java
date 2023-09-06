public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(2, 2);
        int c = calc.devide.apply(a, b);
        /**Деление на ноль (Арифметическая ошибка) в devide, так как в переменную b изначально присваивалось значение 0.
         Добавил тернарный оператор для проверки передаваемых параметров на 0.*/

        int d = calc.multiply.apply(2, 2);
        int e = calc.pow.apply(3);
        int f = calc.abs.apply(-2); // Тернальный оператор работает нормально, получаем модуль числа.

        boolean g = calc.isPositive.test(0);
        /**Возвращает тип boolean, поэтому Consumer не может его принять,
         так как принимает Integer.
         Здесь можно воспользоваться напрямую методом println либо сделать еще Consumer для Boolean типов. */


        calc.println.accept(c);
        calc.println.accept(d);
        calc.println.accept(e);
        calc.println.accept(f);

        System.out.println(g); //Вариант 1 реализации вывода boolean значение
        calc.booleanConsumerPrintln.accept(g); //Вариант 2 реализации вывода boolean значение
    }
}