import java.io.IOException;

public class InputException extends IOException {
    void message() {
        System.out.println("ВВедено отрицательное значение. Введите положительное");
    }
}
