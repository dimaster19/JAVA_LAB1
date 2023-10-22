public class Ex5 {
    public static void main(String[] args) throws Exception {
        System.out.println(getFactorial(Integer.parseInt(args[0])));
    }

    static int getFactorial(int f) {
        if (f <= 1) {
            return 1;
         }
         else {
            return f * getFactorial(f - 1);
         }
     }
}
