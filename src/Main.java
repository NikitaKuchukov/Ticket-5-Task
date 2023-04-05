import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Напишите пример перехвата и обработки исключения в секции throws-метода и передачи вызывающему методу.*/

        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        do {
            try {
                System.out.println("Введите первое числовое значение");
                a = sc.nextInt();
                System.out.println("Введите второе числовое значение");
                b = sc.nextInt();
                System.out.println("Сумма чисел равна: " + getSum(a, b));
            } catch (InputException e) {
                e.message();
            }
        } while (true);
    }

    public static int getSum(int a, int b) throws InputException {
        if (a < 0 || b < 0) throw new InputException();
        return a + b;
    }
}

