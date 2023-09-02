
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args){
        float input = getFloatInput();
        System.out.println("Введенное число: " + input);


    }

    public static float getFloatInput() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите дробное число:");
            while (true) {
                try {
                    float input = Float.parseFloat(scanner.nextLine());
                    return input;
                } catch (NumberFormatException e) {
                    System.out.println("Неверный формат числа, попробуйте ещё раз");
                }
            }
        }
    }
}