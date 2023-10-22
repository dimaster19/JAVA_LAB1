import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) throws Exception {
        int i = args.length;
        ArrayList<String> out = new ArrayList<>();
        while (i > 0) {
            String reversed = "";
            int j = args[i-1].length();
            while (j > 0) {
               reversed+=args[i-1].charAt(j-1);
                j--;
            }
            out.add(reversed);
            i--;
        }
        System.out.println(out);
       }
}