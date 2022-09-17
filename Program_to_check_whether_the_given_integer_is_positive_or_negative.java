import java.util.Scanner;
class pn
{
    public static void main(String args[])
    {
        int i;
        Scanner sc=new Scanner(System.in);
        i=sc.nextInt();
        if(i>=0)
        {
            System.out.println("Positive Number");
        }
        else
        {
            System.out.println("Negative Number");
        }
        sc.close();
    }
}