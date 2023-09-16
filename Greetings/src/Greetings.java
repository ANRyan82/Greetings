import java.util.Scanner;
public class Greetings {
    public static void main(String[] args) {

        System.out.println("Введите ваше имя: ... ");
        String name = new Scanner(System.in).next();
        System.out.println("Введите число один раз! До 5 и выше 5, получите разный вывод сообщения");
        int a = new Scanner(System.in).nextInt();

        if(a > 5)
        {
            System.out.println("Hello " + name + "!");
        }
        if(a < 5)
        {
            System.out.println("Goodbye " + name + "!");
        }
    }
}


