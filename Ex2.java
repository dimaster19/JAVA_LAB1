public class Ex2 {
    public static void main(String[] args) throws Exception {
        int i = 0;
        while (i<501) {
            if (i % 5 ==0 && i % 7 == 0) System.out.println("fizzbuzz");
            else if (i % 7 == 0) System.out.println("buzz");
            else if (i % 5 ==0) System.out.println("fizz");
            else System.out.println(i);
            i++;
       }
     
    }
}
