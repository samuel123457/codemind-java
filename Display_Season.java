
import java.util.*;
class main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n==1||n==12||n==11){
            System.out.print("Winter");
        }
        else if (n==4||n==5||n==6){
            System.out.print("Summer");
        }
        else if (n==7||n==8||n==9||n==10){
            System.out.print("Rainy");
        }
        else if (n==3||n==2){
            System.out.print("Spring");
        }
        else{
            System.out.print("-1");
        }
    }
}