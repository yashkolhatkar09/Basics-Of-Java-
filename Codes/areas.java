import java.util.Scanner;
public class areas
{
    static class area
    {
        public int side;

        public int square()
        {
            return side*side;
        }
        public int peri()
        {
            return side+side+side+side;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        area equ = new area();

        System.out.print("Enter the Side of Square Here : ");
        equ.side=sc.nextInt();

        System.out.println("The Area of Square is : "+ equ.square()+ " sq.units");
        System.out.println("The Perimeter of the Square is : " + equ.peri() + " units");

    }

}
