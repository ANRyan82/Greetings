import java.util.Scanner;
public class Greetings {
    public static void main(String[] args) {

        System.out.println("������� ���� ���: ... ");
        String name = new Scanner(System.in).next();
        System.out.println("������� ����� ���� ���! �� 5 � ���� 5, �������� ������ ����� ���������");
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


