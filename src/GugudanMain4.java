import java.util.Scanner;

public class GugudanMain4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();

        String[] splitValue = inputValue.split(",");
        String result1 = splitValue[0].substring(1);
        String result2 = splitValue[1].substring(0,1);
        int a = Integer.valueOf(result1);
        int b = Integer.valueOf(result2);

        for(int i = 2; i <= a; i++){
            for(int j = 1; j <= b; j++){
                System.out.println(i * j);
            }
        }
    }
}
