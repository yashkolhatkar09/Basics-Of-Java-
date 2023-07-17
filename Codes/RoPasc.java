import java.util.Scanner;
import java.util.Random;


public class RoPasc
{

    public static void main(String[] args)
    {

        Random src = new Random();
        Scanner sc = new Scanner(System.in);


        System.out.println("Rules : (0): Rock ; (1): Paper ; (2) : Scissor ");

        for (int i=0;i<5;i++)
        {
            System.out.print("Enter Your Input Here : ");
            int ans= sc.nextInt();

            if(ans>3 || ans<0)
            {
                System.out.println("Error! Please Run the code again !");

                //goto
            }



            else
            {

                int res=src.nextInt(2);

                switch (res) {
                    case 0:
                        System.out.println("The Computer Chose  : Rock ");
                        break;

                    case 1:
                        System.out.println("The Computer Chose  : Paper ");
                        break;

                    case 2:
                        System.out.println("The Computer Chose  : Scissor ");
                        break;
                }
                if(ans==0 && res==0)
                {

                    System.out.println("The Result is : Draw");
                }
                else if(ans==0 && res==1)
                {
                    System.out.println("Computer Wins ");

                }

                else if(ans==0 && res==2)
                {
                    System.out.println("Congradulations! You Won");
                }

                else if(ans==1 && res==0)
                {
                    System.out.println("Congradulations! You Won");
                }
                else if(ans==1 && res==1)
                {

                    System.out.println("The Result is : Draw ");
                }
                else if(ans==1 && res==2)
                {
                    System.out.println("Computer Wins ");
                }

                else if(ans==2 && res==0)
                {
                    System.out.println("Computer Wins ");
                }

                else if(ans==2 && res==1)
                {
                    System.out.println("Congradulations! You Won");
                }

                else if(ans==2 && res==2)
                {

                    System.out.println("The Result is : Draw ");
                }






            }


        }






    }
}
