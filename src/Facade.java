import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Facade {
    public static void login() throws FileNotFoundException {


        System.out.println("###Facade Pattern!###");
        //retry:
        int passchk = 0;
        int flagb = 0;
        String struse = null;
        String strpas = null;
        int flags = 0;
        while (passchk == 0) {
            Scanner scnr3 = new Scanner(System.in);
            System.out.println("Enter the username:");
            struse = scnr3.nextLine();
            //System.out.println(struse);
            System.out.println("Enter the password:");
            strpas = scnr3.nextLine();
            //System.out.println(strpas);


            //System.out.println("Bridge Pattern!");
            //System.out.println("Reading BuyerInfo.txt");
            File text = new File("BuyerInfo.txt");
            Scanner scnr = new Scanner(text);
            int lineNumber = 1;
            flagb = 0;
            while (scnr.hasNextLine()) {
                String line = scnr.nextLine();
                if (line.contains(struse) && line.contains(strpas)) {
                    flagb = 1;
                    System.out.println("@@@Bridge Pattern!@@@");
                    System.out.println("Setting as a BUYER");
                    System.out.println("You are buying...");
                    File relevance = new File("UserProduct.txt");
                    Scanner screl = new Scanner(relevance);
                    //int ln = 1;
                    List<String> relpro = new ArrayList<String>();
                    while (screl.hasNextLine()) {
                        String lrel = screl.nextLine();
                        String[] p = lrel.split(":");
                        if(p[0].equals(struse)){
                            System.out.println(p[1]);
                        }
                    }
                    passchk = 1;
                    break;

                } else flagb = 0;
                //System.out.println("line " + lineNumber + " :" + line);
                lineNumber++;
            }

            //System.out.println("Reading SellerInfo.txt");
            File text2 = new File("SellerInfo.txt");
            Scanner scnr2 = new Scanner(text2);
            int lineNumber2 = 1;
            flags = 1;
            if (flagb != 1) {
                while (scnr2.hasNextLine()) {
                    String line2 = scnr2.nextLine();
                    if (line2.contains(struse) && line2.contains(strpas)) {
                        flags = 2;
                        System.out.println("@@@Bridge Pattern!@@@");
                        System.out.println("Setting as a SELLER");
                        System.out.println("You are selling...");
                        File relevance = new File("UserProduct.txt");
                        Scanner screl = new Scanner(relevance);
                        //int ln = 1;
                        //List<String> relpro = new ArrayList<String>();
                        while (screl.hasNextLine()) {
                            String lrel = screl.nextLine();
                            String[] p = lrel.split(":");
                            if(p[0].equals(struse)){
                                System.out.println(p[1]);
                            }
                        }

                        passchk = 1;
                        break;
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
                passchk = 0;
                //continue retry;
            }

        }


//        //System.out.println("Factory Method!");
       List<String> listx = new ArrayList<String>();
//        if (flagb == 1) {
//            System.out.println("You are willing to buy the following products:");
//            File textx = new File("UserProduct.txt");
//            Scanner scnrx = new Scanner(textx);
//            while (scnrx.hasNextLine()) {
//                String linex = scnrx.nextLine();
//                String[] parts = linex.split(":");
//                if (parts[0].equals(struse)) {
//                    listx.add(parts[1]);
//                    System.out.println(parts[1]);
//                    //System.out.println(listx);
//                    //System.out.println("Enter your choice: ");
//                    //Scanner scnr5 = new Scanner(System.in);
//                    //int input = scnr5.nextInt();
//                }
//
//
//            }
//        }
//
       //List<String> listy = new ArrayList<String>();
//        if (flags == 2) {
//            System.out.println("You are willing to sell the following products:");
//            File texty = new File("UserProduct.txt");
//            Scanner scnry = new Scanner(texty);
//            while (scnry.hasNextLine()) {
//                String linex = scnry.nextLine();
//                String[] parts = linex.split(":");
//                if (parts[0].equals(struse)) {
//                    listy.add(parts[1]);
//                    System.out.println(parts[1]);
//                    //System.out.println(listx);
//                    //System.out.println("Enter your choice: ");
//                    //Scanner scnr5 = new Scanner(System.in);
//                    //int input = scnr5.nextInt();
//                }
//
//
//            }
//        }

        System.out.println("$$$Factory Method!$$$");
        System.out.println("Enter your choice: 1. Meat  2. Produce:");
        Scanner scnr5 = new Scanner(System.in);
        int input = scnr5.nextInt();
        //System.out.println("$$$Factory Method!$$$");
        System.out.println("^^^Iterator Method!^^^");

        //System.out.println((input));
        if (input == 1) {
            //System.out.println()
            ProductMenu pm = new MeatProductMenu();
            //System.out.println("PPPP");
            pm.showMenu();

        } else if (input == 2) {
            ProductMenu pm2 = new ProduceProductMenu();
            //System.out.println("FGFG");
            pm2.showMenu();

        }
        //System.out.println(prodProds);


    }
    }



