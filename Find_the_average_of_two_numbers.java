import java.util.Scanner;
class avg
{
    public static void main(String arg[])
    {
        double a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=(a+b)/2;
        System.out.printf("%.4f",c);
        sc.close();
    }
}