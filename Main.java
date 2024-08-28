import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;

        System.out.println("Positive or Negative Number");
        
        if(n>0){
            System.out.println("positive Number");
        } else if (n<0) {
            System.out.println("Negative Number");
        }
        else {
            System.out.println("Zero");
        }

        switch (n%7){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Not A WeekDay");
        }




        // Print the number 1 to N

        System.out.println("Print the number 1 to N ");

        for(int i=0;i<n;i++){
            System.out.println(i);
        }


        //   While Loop

        System.out.println("While Loop");

        int i=n;
        while(i>0){
            System.out.println(i);
            i--;
        }

        //   Do-While Loop

        System.out.println("Using Do-while");
        int j=1;
        do {
            System.out.println(j);
            j++;
        } while (j<=n);

    }
}
