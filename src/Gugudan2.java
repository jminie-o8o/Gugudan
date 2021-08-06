import java.util.Scanner;

public class Gugudan2 {
    public static void main(String[] args) {
        System.out.println("단을 입력하세요!");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (2 <= number && number <= 9) {
            for(int i = 1; i < 10; i++){
                System.out.println(number +" X "+ i +" = "+(number * i));
            }
        }else {
            System.out.println("2이상, 9이하의 값만 입력할 수 있습니다");
        }
    }
}
