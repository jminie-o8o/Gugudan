import java.util.Scanner;

public class Gugudan {
    public static void main(String[] args) {
        System.out.println("구구단 중 출력할 단은? : ");
        Scanner sc = new Scanner(System.in);
        int number  = sc.nextInt();

        for(int i = 1; i < 10;i++){
            System.out.println(number+" X "+ i +" = "+(number * i));
        }
    }
}
