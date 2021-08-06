
public class Gugudan3 {
    public static void main(String[] args) {
        int number;
        for(number = 2; number <= 9; number++){
            int[] numarray = new int[9];
            for(int i = 0; i < numarray.length; i++){
                numarray[i] = number * (i+1);
            }
            for(int i = 0; i< numarray.length; i++){
                System.out.println(numarray[i]);
            }
        }
    }
}
