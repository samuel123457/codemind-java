import java.util.Scanner;
class clo
{
    public static void main(String args[])
    {
        String n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextLine();
        switch(n)
        {
            case "v":
            case "V":
                System.out.println("Violet");
                break;
            case "I":
            case "i":
                System.out.println("Indigo");
                break;
            case "b":
            case "B":
                System.out.println("Blue");
                break;
            case "g":
            case "G":
                System.out.println("Green");
                break;
            case "y":
            case "Y":
                System.out.println("Yellow");
                break;
            case "o":
            case "O":
                System.out.println("Orange");
                break;
            case "r":
            case "R":
                System.out.println("Red");
                break;
            default:
                System.out.println("-1");
                break;
        }
    }
}