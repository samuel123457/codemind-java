import java.util.Scanner;
class min
{
    public static void main(String args[])
    {
        int n,a;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        a=(int)(n*(n-1))/2;
        System.out.println(a);
    }
}