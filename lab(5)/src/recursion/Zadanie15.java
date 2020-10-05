package recursion;

public class Zadanie15
{
    public static int recursion(int ch)
    {
        if (ch<10){
            return (ch);
        }
        System.out.println(ch%10);
        return recursion(ch/10);
    }


    public static void main(String[] a)
    {
        System.out.println(recursion(12345));
    }
}