import java.util.Scanner;
public class strings
{
    public static void main(String[] args)
    {
        String lol;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String Here : ");
        String st = sc.nextLine();

        System.out.println("The String is : ");
            System.out.println(st);

            System.out.println("The Length of String is : "+st.length());
            System.out.println("The Lower Case is  : "+st.toLowerCase());
            System.out.println("The Upper Case is  : "+st.toUpperCase());
//            System.out.println("The Trimmed Case is  : "+st.trim());

    }

}
