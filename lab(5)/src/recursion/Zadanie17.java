package recursion;

public class Zadanie17
{
    public static void recursion(int max)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        if (a>0)
        {
            if (a>max){
                recursion(a);
            }
            else if (a==max){
                recursion(max);
            }
            else{
                recursion(max);
            }
        }
        else System.out.println(max);
    }


    public static void main(String[] args)
    {
        recursion(0);
    }
}