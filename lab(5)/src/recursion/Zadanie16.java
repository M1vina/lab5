package recursion;
import java.util.Scanner;

public class Zadanie16
{
    public static void recursion(int max,int c)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int a = sc.nextInt();
        if (a>0)
        {
            if (a>max){
                recursion(a, 1);
            }
            else if (a==max){
                recursion(max,c+1);
            }
            else{
                recursion(max,c);
            }
        }
        else System.out.println(c);
    }


    public static void main(String[] args)
    {
       recursion(0,0);
    }
}