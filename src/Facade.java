import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;

public class Facade {
    public static void login() throws FileNotFoundException {


        System.out.println("Facade Pattern!");

        Scanner scnr3 = new Scanner(System.in);
        System.out.println("Enter the username:");
        String struse = scnr3.nextLine();
        //System.out.println(struse);
        System.out.println("Enter the password:");
        String strpas = scnr3.nextLine();
        //System.out.println(strpas);


        System.out.println("Bridge Pattern!");
        //System.out.println("Reading BuyerInfo.txt");
        File text = new File("BuyerInfo.txt");
        Scanner scnr = new Scanner(text);
        int lineNumber = 1;
        int flagb = 0;
        while (scnr.hasNextLine()) {
            String line = scnr.nextLine();
            if (line.contains(struse) && line.contains(strpas)) {
                flagb = 1;
                System.out.println("Setting as a BUYER");

            } else flagb = 0;
            //System.out.println("line " + lineNumber + " :" + line);
            lineNumber++;
        }

        //System.out.println("Reading SellerInfo.txt");
        File text2 = new File("SellerInfo.txt");
        Scanner scnr2 = new Scanner(text2);
        int lineNumber2 = 1;
        int flags = 1;
        if (flagb != 1) {
            while (scnr2.hasNextLine()) {
                String line2 = scnr2.nextLine();
                if (line2.contains(struse) && line2.contains(strpas)) {
                    flags = 2;
                    System.out.println("Setting as a SELLER");
                } else flags = 0;
                //System.out.println("line " + lineNumber2 + " :" + line2);
                lineNumber2++;

            }
        }

        //if (flagb==1)
        //{System.out.println("Setting as a BUYER");}
        //if (flags==2) {
        //System.out.println("Setting as a SELLER");
        //}
        //System.out.println(flagb);
        //System.out.println(flags);
        if (flagb == 0 && flags == 0) {
            System.out.println("Incorrect username and/or password");
        }


        System.out.println("Factory Method!");
        System.out.println("Enter your choice: 1. Meat  2. Produce:");
        Scanner scnr5 = new Scanner(System.in);
        int input = scnr5.nextInt();
        //System.out.println((input));
        if(input==1)

        {
            ProductMenu pm = new MeatProductMenu();
            //System.out.println("PPPP");
            pm.showMenu();

        } else if(input==2)

        {
            ProductMenu pm2 = new ProduceProductMenu();
            //System.out.println("FGFG");
            pm2.showMenu();

    }
    //System.out.println(prodProds);







    }
}


