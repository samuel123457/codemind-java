import java.util.Scanner;
class Tri
{
    public static void main(String arg[])
    {
        int a,b,c;
        float s;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(float)(a+b+c)/2;
        //=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",Math.sqrt(s*(s-a)*(s-b)*(s-c)));
        sc.close();
    }
}