import java.util.Scanner;
class simple
{
    public static void main(String args[])
    {
        int p,t,r,sum;
        Scanner sc=new Scanner(System.in);
        p=sc.nextInt();
        t=sc.nextInt();
        r=sc.nextInt();
        sum=(p*t*r)/100;
        System.out.println(sum);
    }
    //sc.close();
}