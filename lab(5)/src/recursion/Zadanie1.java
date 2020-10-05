package recursion;

public class Zadanie1
{
    public static int recursion(int n)
    {
        int N=n;
        if (N==1)
        {
            return 1;
        }
        for (int i=0;i<N;i++)
        {
            System.out.println(n);
        }
        return recursion((n-1));
    }
    public static void main(String[] args)
    {
        System.out.println(recursion(15));
    }
}

