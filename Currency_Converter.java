import java.util.Scanner;
public class Currency_Converter
{
    public static void main(String[] args)
    {
        System.out.println("1.Ruppe");
        System.out.println("2.Dollar");
        System.out.println("3.Euro");

        //take input from user
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose the Currency: ");
        int choice=sc.nextInt();

        System.out.print("Enter the Amount: ");
        double Amount=sc.nextDouble();

        //converting the amount
        switch(choice)
        {
            case 1:
            Ruppe_to_other(Amount);
            break;

            case 2:
            Dollar_to_other(Amount);
            break;

            case 3:
            Euro_to_other(Amount);
            break;

            default:
            System.out.println("Invalid Input!");

        }

    }
    public static void Ruppe_to_other(Double Amount)
    {
        System.out.println("1 Ruppe="+"0.012"+"Dollar");
        System.out.println();
        System.out.println(Amount+"Ruppe="+Amount*0.012+"Dollars");
        System.out.println();

        System.out.println("1 Ruppe="+"0.011"+"Euro");
        System.out.println();
        System.out.println(Amount+"Ruppes="+Amount*0.011+"Euros");
        System.out.println();

    }
    public static void Dollar_to_other(Double Amount)
    {
        System.out.println("1 Dollar="+"80.98"+"Ruppes");
        System.out.println();
        System.out.println(Amount+"Dollars="+Amount*80.98+"Ruppes");
        System.out.println();

        System.out.println("1 Dollar="+"0.92"+"Euro");
        System.out.println();
        System.out.println(Amount+"Dollars="+Amount*0.92+"Euros");
        System.out.println();


    }
    public static void Euro_to_other(Double Amount)
    {
        System.out.println("1 Euro="+"87.90"+"Ruppes");
        System.out.println();
        System.out.println(Amount+"Euros="+Amount*87.90+"Ruppes");
        System.out.println();

        System.out.println("1 Euro="+"1.09"+"Dollars");
        System.out.println();
        System.out.println(Amount+"Euros="+Amount*1.09+"Dollars");
        System.out.println();


    }
    

}

//Contributed by Shreyash