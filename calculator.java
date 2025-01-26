import java.util.Scanner;
public class calculator{
    public static void main(String [] args){
        int operator,a,b;
        System.out.println("1-addition");
        System.out.println("2-subraction");
        System.out.println("3-multiply");
        System.out.println("4-division");
        System.out.println("choose operator:");
        Scanner sc =new Scanner(System.in);
        operator=sc.nextInt();
        System.out.println("enter first number");
        a=sc.nextInt();
        System.out.println("enter second number");
        b=sc.nextInt();
        int result=0;
        switch (operator){
            case 1:
            result=a+b;
            break;
            case 2:
            result=a-b;
            break;
            case 3:
            result=a*b;
            break;
            case 4:
            result=a%b;
            break;
            default:
            System.out.println("entered operator is not valid");
        }
        System.out.println("result is:" +result);

        
        


    }
}


