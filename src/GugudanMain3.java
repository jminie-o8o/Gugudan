import java.util.Scanner;

public class GugudanMain3 {
    public static void main(String[] args) {

        String[] splitValue = scan().split(",");
        int a = Integer.valueOf(splitValue[0]);
        int b = Integer.valueOf(splitValue[1]);

        for(int i = 2; i <= a; i++){
            for(int j = 1; j <= b; j++){
                System.out.println(i * j);
            }
        }
    }

    public static String scan(){
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();

        return inputValue;
    }

}
