/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcatering_package;

import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 *  class FoodCatering contain main method to start Program
 */
public class FoodCatering {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        /**
         * lists of items card coding in main method
         */
        ArrayList<Item>items1=new ArrayList<>();
        items1.add(new Item("ptoto", Category.DESERTS, 3, 5.8f, 2));
        items1.add(new Item("tea", Category.DESERTS, 1, 2.8f, 2));
        items1.add(new Item("Ric", Category.DESERTS, 3, 5.8f, 2));
        items1.add(new Item("Bebs", Category.DESERTS, 3, 5.8f, 2));

        ArrayList<Item>items2=new ArrayList<>();
        items2.add(new Item("SoclitCeck", Category.DESERTS, 3, 5.8f, 2));
        items2.add(new Item("Ptoto", Category.APPETIZERS, 1, 2.8f, 2));
        items2.add(new Item("krib", Category.MAINDISHES, 3, 5.8f, 2));
        items2.add(new Item("Pepsi", Category.DESERTS, 3, 5.8f, 2));
        ArrayList<Item>items3=new ArrayList<>();
        
        items3.add(new Item("pasta", Category.MAINDISHES, 3, 5.8f, 2));
        items3.add(new Item("checiCack", Category.DESERTS, 1, 2.8f, 2));
        items3.add(new Item("cafa", Category.DRINKS, 3, 5.8f, 2));
        items3.add(new Item("Fshar", Category.APPETIZERS, 3, 5.8f, 2));
        ArrayList<Item>items4=new ArrayList<>();
        items4.add(new Item("meat", Category.MAINDISHES, 3, 5.8f, 2));
        items4.add(new Item("frishjuse", Category.DRINKS, 1, 2.8f, 2));
        items4.add(new Item("Ric", Category.MAINDISHES, 3, 5.8f, 2));
        items4.add(new Item("snacks", Category.APPETIZERS, 3, 5.8f, 2));
        
        ArrayList<Item>items5=new ArrayList<>();
        items5.add(new Item("ptoto", Category.APPETIZERS, 3, 5.8f, 2));
        items5.add(new Item("tea", Category.DRINKS, 1, 2.8f, 2));
        items5.add(new Item("petiza", Category.MAINDISHES, 3, 5.8f, 2));
        items5.add(new Item("Bebs", Category.DRINKS, 3, 5.8f, 2)); 
        /**
         * meals card coding in main method
         */
        Meal meal1=new Meal("111", "FamilyMeal", items1);
        Meal meal2= new Meal("222", "IndividualMeal", items2);
        Meal meal3=new Meal("333", "FamilyMeal", items3);
        Meal meal4=new Meal("444", "IndividualMeal", items4);
        Meal meal5=new Meal("555", "FamilyMeal", items5);
        /**
         * lists of meals hard coding in main method
         */
        ArrayList<Meal> arrayListMeals=new ArrayList<>();
        arrayListMeals.add(meal1);
        arrayListMeals.add(meal2);
        arrayListMeals.add(meal3);
        arrayListMeals.add(meal4);
        arrayListMeals.add(meal5);
        Date daterigestion1= new Date(2020, 6, 1);
        Date daterigestion2= new Date(2020, 6, 10);
        Date daterigestion3= new Date(2020, 6, 19);
        Date dateDelivary1= new  Date(2020, 6, 8);
        Date dateDelivary2= new  Date(2020, 6, 13);
        Date dateDelivary3= new  Date(2020, 6, 19);
        /**
         * lists of orders card coding in main method
         */
        Order order1 = new  Order("00011", arrayListMeals,  daterigestion1, 
                 dateDelivary1, "Naser City");       
         Order order2 = new  Order("00012", arrayListMeals,  daterigestion2, 
                dateDelivary2, "Naser City");
          Order order3 = new  Order("00013", arrayListMeals,daterigestion3, 
                 dateDelivary3, "Fium City");
          Order order4 = new  Order("00014", arrayListMeals,daterigestion2, 
                 dateDelivary2, "Imbaba City");
          Order order5 = new  Order("00015", arrayListMeals,daterigestion2, 
                 dateDelivary2, "Cairo City");
        ArrayList<Order> arrayListOreders1=new ArrayList<>();
        arrayListOreders1.add(order1);
        arrayListOreders1.add(order4);
        ArrayList<Order> arrayListOreders2=new ArrayList<>();
        arrayListOreders2.add(order2);
        arrayListOreders2.add(order3);
        ArrayList<Order> arrayListOreders3=new ArrayList<>();
        arrayListOreders3.add(order3);
        arrayListOreders3.add(order1);
        ArrayList<Order> arrayListOreders4=new ArrayList<>();
        arrayListOreders4.add(order4);
        ArrayList<Order> arrayListOreders5=new ArrayList<>();
        arrayListOreders5.add(order5);
        /**
         * lists of loyalty customer in main method
         */
        LoyaltyCustomer loyaltyCustomer1= new LoyaltyCustomer("111", "222", "mira", "Amira", 21,arrayListOreders1);
        LoyaltyCustomer loyaltyCustomer2= new LoyaltyCustomer("333", "444", "nour", "Norhan", 19,arrayListOreders2) ;
        LoyaltyCustomer loyaltyCustomer3= new LoyaltyCustomer("555", "666", "momo", "Mohmed", 31,arrayListOreders3);
        LoyaltyCustomer loyaltyCustomer4= new LoyaltyCustomer("777", "888", "koko", "Karima", 20,arrayListOreders5);
        LoyaltyCustomer loyaltyCustomer5= new LoyaltyCustomer("999", "1010", "kimo", "Karim", 18,arrayListOreders5);
        ArrayList<LoyaltyCustomer>  loyaltyCustomers=new ArrayList<>();
        loyaltyCustomers.add(loyaltyCustomer1);
        loyaltyCustomers.add(loyaltyCustomer2);
        loyaltyCustomers.add(loyaltyCustomer3);
        loyaltyCustomers.add(loyaltyCustomer4);
        loyaltyCustomers.add(loyaltyCustomer5);
        ArrayList<Meal> arrayListMealsOfCustomer=new ArrayList<>();
        /**
         *  Array of orders for Gusets
         */
        ArrayList<Order>GusetsOrdes =new ArrayList<>();
        GusetsOrdes.add(order5);
        GusetsOrdes.add(order1);
        GusetsOrdes.add(order3);
        GusetsOrdes.add(order4);
        GusetsOrdes.add(order1);
        Guest guest = new Guest();
        guest.setOrder(GusetsOrdes);
        guest.setName(" New Guest");
        guest.setAge(22);
        guest.setUserName("N_guest");
        Date dateRegsiter = new Date(2020,6,9);
        Date dateDervily = new Date(2020,8,1);
        Menu menu=new Menu();
        LoyaltyCustomerLogin customerLogin= new LoyaltyCustomerLogin();
        Meal m = new Meal();
        int k =0;
        int choise=0;
        Order order;
        ArrayList<Item> i=new ArrayList<>();
        menu.setArrayOfMeals(arrayListMeals);
        Scanner scan =new Scanner(System.in);
        System.out.println("                                               ❤❤❤❤❤ Welcom A Food Catering Delivery Application ❤❤❤❤❤");
        System.out.println("                                                        #############################################");
        System.out.println("");
        System.out.println("");
        System.out.print("                                                             If Admin Enter 1 If user Enter 2  :");
        try 
        {choise=scan.nextInt();}
        catch(InputMismatchException e)
         {System.out.println("Input Must Be Interger Number");
          System.out.println(e.getMessage());
        }
        System.out.println("                                                         ======================================");
        char c;
        LoyaltyCustomer loyaltyCustomer=new LoyaltyCustomer();
        if(choise==1)
        {
          Admin admin=new Admin();
           boolean v=true;
           AdminLogin adminLogin=new AdminLogin();
           do{
           boolean b=adminLogin.Login();
           if(b)        
           {
               admin=adminLogin.getAdmin();
               System.out.println("=======================================");
               System.out.println("                 Admin Data");
               System.out.println("           ************************");
               adminLogin.DisplayLoginData();
               System.out.println("=======================================");
               System.out.println("          Admin Can ............");
               System.out.println("");
               System.out.println("1-Add Meal From Menu.");
               System.out.println("2-Delete Meal From Menu.");
               System.out.println("3-Updata Meal From Menu.");
               System.out.println("4-Add LoyaltyCustomer .");
               System.out.println("5-Remove LoyaltyCustomer.");
               System.out.println("");
               System.out.print("Admin Enter Process which You Wont TO Do : ");
               c=scan.next().charAt(0);
               System.out.println("============================================");
               adminLogin.getAdmin().setMenu(menu);
               switch(c)
               { 
                   case'1':
                       System.out.println("                  Before Add New Meal To Menu.........");
                       System.out.println("");
                       menu.DisplayLoginData();
                       System.out.print("Enter Type Of ([f] for family or [i] for individual) New Meal : ");
                       if(scan.next().charAt(0)=='f'||scan.next().charAt(0)=='F')
                       {
                           m.setTypeMeal("Family");
                       }
                       else
                       {
                          m.setTypeMeal("Individual");
                       }
                       System.out.print("Enter ID Of New Meal ");
                       m.setIDMeal(scan.next());
                       System.out.print("Enter Number Items  Of New Meal ");
                       try{k =scan.nextInt();} 
                       catch(InputMismatchException e)
                       {System.out.println("Input Must Be Interger Number");
                         System.out.println(e.getMessage());
                       }
                       for (int j = 0; j < k; j++) {
                           try{
                            Item i1=new Item(Category.DESERTS);
                            System.out.println((j+1)+" - Item" );
                            System.out.print("Name Item :" );
                            i1.setName(scan.next());
                            System.out.print("NumOfCalories Item :");
                             i1.setNumOfCalories(scan.nextInt());
                            System.out.print("Portion Item :");
                            i1.setPortion(scan.nextInt());
                            System.out.print("Price Item :");
                            i1.setPrice(scan.nextFloat());
                            i.add(i1);
                           }
                           catch(InputMismatchException e)
                           {
                             System.out.println("Input Must Be Interger Number");
                             System.out.println(e.getMessage());
                             break;
                           }
                            System.out.println("-------------------------------------------------------");
                       }
                       m.setItems(i);
                       System.out.println("                  After Add New Meal To Menu.........");
                       System.out.println("");
                       adminLogin.getAdmin().getMenu().AddMeal(m);
                       menu.DisplayLoginData();
                       break;
                    case'2':
                       System.out.println("                  Before Remove Meal To Menu.........");
                       System.out.println("");
                       menu.DisplayLoginData();
                       System.out.print("Enter Type Of ([f] for family or [i] for individual) New Meal : ");
                        if(scan.next().charAt(0)=='f'||scan.next().charAt(0)=='F')
                        {
                           m.setTypeMeal("Family");
                        }
                        else
                        {
                          m.setTypeMeal("Individual");
                        }
                        System.out.print("Enter Id Of Meal :");
                        m.setIDMeal(scan.next());
                        adminLogin.getAdmin().getMenu().RemoveMeal(m);
                        System.out.println("                  After Remove Meal To Menu.........");
                        System.out.println("");
                        menu.DisplayLoginData();
                        break;
                   case'3':
                       adminLogin.getAdmin().getMenu().setArrayOfMeals(arrayListMeals);
                       System.out.println("                  Before Updata Meal To Menu.........");
                       System.out.println("");
                       menu.DisplayLoginData();
                       System.out.print("Enter Type Of ([f] for family or [i] for individual) New Meal : ");
                       if(scan.next().charAt(0)=='f'||scan.next().charAt(0)=='F')
                       {
                           m.setTypeMeal("Family");
                       }
                       else
                       {
                          m.setTypeMeal("Individual");
                       }
                       System.out.print("Enter Id Of Meal :");
                       m.setIDMeal(scan.next());
                       System.out.println("");
                       adminLogin.getAdmin().getMenu().UpdataMeal(m); 
                       System.out.println("                  After Updata Meal To Menu.........");
                       System.out.println("");
                       menu.DisplayLoginData();
                        break;
                    case'4':
                        System.out.println("                     Data Befor Add New Customer...........");
                        System.out.println("");
                        LoyaltyCustomerLogin.arrylist=loyaltyCustomers;
                        customerLogin.DisplayLoginData();
                        System.out.println("===========================================");
                        System.out.print("Enter ID Of loyaltyCustomer : ");
                        loyaltyCustomer.setID(scan.next());
                        System.out.print("Enter Name Of loyaltyCustomer : ");
                        loyaltyCustomer.setName(scan.next());
                        System.out.print("Enter Password Of loyaltyCustomer : ");
                        loyaltyCustomer.setPassword(scan.next());
                        System.out.print("Enter UserName Of loyaltyCustomer : ");
                        loyaltyCustomer.setUserName(scan.next());
                        System.out.print("Enter Age Of loyaltyCustomer : ");
                        try {loyaltyCustomer.setAge(scan.nextInt());}
                        catch(InputMismatchException e)
                        {System.out.println("Input Must Be Interger Number");
                         System.out.println(e.getMessage());
                        }
                        loyaltyCustomers.add(loyaltyCustomer);
                        System.out.println("                   Done............... ");
                        System.out.println("===========================================");
                        System.out.println("");
                        System.out.println("                    Data After Add New loyaltyCustomer...............");
                        System.out.println();
                        System.out.println("");
                        LoyaltyCustomerLogin.arrylist=loyaltyCustomers;
                        customerLogin.DisplayLoginData();
                        System.out.println("===========================================");
                        break;
                    case '5':
                        System.out.println("                     Data Befor Delete Customers...........");
                        System.out.println("");
                        LoyaltyCustomerLogin.arrylist=loyaltyCustomers;
                        customerLogin.DisplayLoginData();
                        System.out.println("===========================================");
                        System.out.print("Enter ID Of loyaltyCustomer For Remove : ");
                        loyaltyCustomer.setID(scan.next());
                        boolean r=false;
                        for (int j = 0; j < loyaltyCustomers.size(); j++) {
                            if(loyaltyCustomers.get(j).getID().equals(loyaltyCustomer.getID()))
                            {
                                loyaltyCustomers.remove(j);
                                System.out.println("                   Done............... ");
                                System.out.println("===========================================");
                                System.out.println("");
                                System.out.println("                    Data After Delete loyaltyCustomer...............");
                                System.out.println();
                                System.out.println("");
                                LoyaltyCustomerLogin.arrylist=loyaltyCustomers;
                                customerLogin.DisplayLoginData();
                                System.out.println("===========================================");
                                r=true;
                                break;
                            }  
                        }
                        if(r==false)
                        {
                            System.out.println("Not Found This loyaltyCustomers............");
                            System.out.println("===========================================");
                        }
                        break;
                    default:
                       System.out.println("Error Enter Number ");
                        break;
               }
               break;
            }
           else
           {
               System.out.print("If You Wont Try Agin Enter (Y) :");
               c=scan.next().charAt(0);
               if(c=='Y'||c=='y')
               {
                   v=true;
               }
               else
               {
                   v=false;
               }
           }
           }while(v==true);
        }
        else if(choise==2)
        {
            System.out.println("                                                                   Hello Customer.........");
            System.out.println("                                                               ============================");
            System.out.println("");
            System.out.println("1-Guest..................2-LoyaltyCustomer...................");
            System.out.println("___________________________________________________________________");
            System.out.println("");
            System.out.print("Enter Choise : ");
            c=scan.next().charAt(0);
            System.out.println("================================================");
            System.out.println("");
            if(c=='1')
            {               
               System.out.println("                  Hello Guest.........");
               System.out.println("=================================================");
               System.out.println();
               guest.DisplayLoginData();
               System.out.println();
               System.out.println("------------------");
               System.out.println("Your Orders......");
               System.out.println("------------------");
               guest.DisplayOrders();
               System.out.println("           Can Guest Doing any Process If You Do............");
               System.out.println("");
               System.out.println("1-Create Order");
               System.out.println("2-Updata Oreder.");
               System.out.println("3-Extand Delivery Date of Order.");
               System.out.println("4-Cancel Order.");
               System.out.println("");
               System.out.print("LoyalityCustomer Enter Process which You Wont TO Do : ");
               c=scan.next().charAt(0);
               System.out.println("");
               System.out.println("           ---------------------");
               System.out.println("           ---------------------");
               System.out.println("               ❤❤ Menu ❤❤      ");
               System.out.println("           ---------------------");
               System.out.println("           ---------------------");
               menu.DisplayLoginData();
               System.out.println("============================================");
               switch(c)
               {
                case '1':
                    guest.AddNewOrder("990009", dateRegsiter, dateDervily);
                    System.out.println();
                    System.out.println("             Orders For guest ");
                    System.out.println("             ---------------------------");
                    guest.DisplayOrders();
                    break;
                case'2':
                    System.out.println("Your Orders Before Udata...........");
                    System.out.println("-----------------------");
                    guest.DisplayOrders(); 
                    System.out.print("Enter Uncode Of Order Wont To Udata :");
                    guest.UpdataOrder(scan.next());
                    System.out.println("Your Orders After Udata...........");
                    System.out.println("-----------------------");
                    guest.DisplayOrders();
                    break;
                case'3':
                    System.out.println("Your Orders Before Extand Time of Order...........");
                    System.out.println("-----------------------");
                    guest.DisplayOrders(); 
                    System.out.print("Enter Uncode Of Order Wont To Cancel :");
                    guest.ExtandOrder(scan.next());
                    System.out.println("Your Orders After Extand Time of Order...........");
                    System.out.println("-----------------------");
                    guest.DisplayOrders();
                    break;
                case'4':
                    System.out.println("Your Orders Before Cancel Order...........");
                    System.out.println("-----------------------");
                    guest.DisplayOrders(); 
                    System.out.print("Enter Uncode Of Order Wont To Cancel :");
                    guest.CancelOrder(scan.next());
                    System.out.println("Your Orders After Cancel Order...........");
                    System.out.println("-----------------------");
                    guest.DisplayOrders();
                    break;
                 default:
                     System.out.println("Error Input Try Agin...............");
                     break;
               }  
                System.out.println("");
                guest.Review();
                System.out.println("");
            }
            else if (c=='2')
            {
                System.out.println("                  Hello LoyaltyCustomer .........");
                System.out.println("                       ");
                boolean v1=true;
                do
                {
                    LoyaltyCustomerLogin.arrylist=loyaltyCustomers;
                    System.out.println("");
                    boolean b=customerLogin.Login();
                    System.out.println("");
                    LoyaltyCustomer lc = new LoyaltyCustomer();
                    if(b)
                    {
                       System.out.println("=================================================");
                       lc = customerLogin.getLc();
                       lc.DisplayLoginData();
                       System.out.println("=================================================");
                       System.out.println();
                       System.out.println("           Can LoyalityCustomer............");
                       System.out.println("");
                       System.out.println("1-Create Order");
                       System.out.println("2-Updata Oreder.");
                       System.out.println("3-Extand Delivery Date of Order.");
                       System.out.println("4-Cancel Order.");
                       System.out.println("");
                       System.out.print("LoyalityCustomer Enter Process which You Wont TO Do : ");
                       c=scan.next().charAt(0);
                       System.out.println("");
                       System.out.println("           ---------------------");
                       System.out.println("           ---------------------");
                       System.out.println("               ❤❤ Menu ❤❤      ");
                       System.out.println("           ---------------------");
                       System.out.println("           ---------------------");
                       menu.DisplayLoginData();
                       System.out.println("============================================");
                       switch (c)
                       {
                            case'1':
                                lc.AddNewOrder("10009",daterigestion1,dateDelivary1);
                                loyaltyCustomers.add(customerLogin.getIndex(), lc);
                                System.out.println();
                                System.out.println("             Orders For loyaltyCustomers ");
                                System.out.println("             ---------------------------");
                                lc.DisplayOrders();   
                               break;
                            case'2':
                                System.out.println("Your Orders Before Udata...........");
                                System.out.println("-----------------------");
                                lc.DisplayOrders(); 
                                System.out.print("Enter Uncode Of Order Wont To Udata :");
                                lc.UpdataOrder(scan.next());
                                System.out.println("Your Orders After Udata...........");
                                System.out.println("-----------------------");
                                lc.DisplayOrders(); 
                               break;
                            case'3':
                                System.out.println("Your Orders Before Extand Time of Order...........");
                                System.out.println("-----------------------");
                                lc.DisplayOrders(); 
                                System.out.print("Enter Uncode Of Order Wont To Cancel :");
                                lc.ExtandOrder(scan.next());
                                System.out.println("Your Orders After Extand Time of Order...........");
                                System.out.println("-----------------------");
                                lc.DisplayOrders();
                                break;
                            case'4':
                                System.out.println("Your Orders Before Cancel Order...........");
                                System.out.println("-----------------------");
                                lc.DisplayOrders(); 
                                System.out.print("Enter Uncode Of Order Wont To Cancel :");
                                lc.CancelOrder(scan.next());
                                System.out.println("Your Orders After Cancel Order...........");
                                System.out.println("-----------------------");
                                lc.DisplayOrders();
                                break;
                            default:
                                System.out.println("Error Input Try Agin............");
                                break;
                       }
                       System.out.println("");
                       lc.Review();
                       System.out.println("");

                        break;
                    }
                     else
                    {
                      System.out.println("Error Login LoyalityCustomer !!......");
                      System.out.print("If You Wont Try Agin Enter (Y) :");
                      c=scan.next().charAt(0);
                      if(c=='Y'||c=='y')
                      {
                       v1=true;
                      }
                      else
                      {
                       v1=false;
                      }
                    }
                }while(v1==true);
            }
        }
        else
        {
            System.out.println(" Error Input");
        }
    }
}
