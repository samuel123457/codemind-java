import java.util.Scanner;
class cov
{
    public static void main(String args[])
    {
        String x;
        Scanner sc=new Scanner(System.in);
        x=sc.nextLine();
        switch(x)
        {
            case "a":
            case "A":
            case "e":
            case "E":
            case "I":
            case "i":
            case "o":
            case "O":
            case "u":
            case "U":
                System.out.println("Vowel");
                break;
            default :
                System.out.println("Consonant");
                break;
            
        }
    }
}