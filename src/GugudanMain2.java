public class GugudanMain2 {
    public static void main(String[] args) {
        print(gugu8(2));
        print(gugu19(2));
    }

    public static int[] gugu8(int number){
        int[] result = new int[8];
        for(int i = 0; i < result.length; i++){
            result[i] = number * (i+1);
        }
        return result;
    }

    public static int[] gugu19(int number){
        int[] result = new int[19];
        for(int i = 0; i < result.length; i++){
            result[i] = number * (i+1);
        }
        return result;
    }

    public static void print(int[] result){
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
    }
}
