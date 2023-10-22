public class Ex6 {

    public static void main(String[] args) throws Exception {
        eratosthenes(Integer.parseInt(args[0]));
    }

    static void eratosthenes(int n)
    {
        boolean array[] = new boolean[n+1];
        for(int i=0;i<=n;i++)
            array[i] = true;
         
        for(int p = 2; p*p <=n; p++)
        {
            if(array[p] == true)
            {
                for(int i = p*p; i <= n; i += p)
                    array[i] = false;
            }
        }
        for(int i = 2; i <= n; i++)
        {
            if(array[i] == true)
                System.out.print(i + " ");
        }
    }

}
