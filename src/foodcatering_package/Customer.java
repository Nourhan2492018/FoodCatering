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
 * @author Norhan
 * abstract class Customer extends Person and implements Display interface
 * has attributes ID ,password,UserName,orders For Customer.
 */
public abstract class Customer extends Person implements Display{
    /**
     * using encapsulation by  Access modifier private attributes
     */
    private String ID;
    private String password;
    private String UserName;
    private ArrayList< Order> orders;
    private Scanner input = new Scanner(System.in);
    private  Order order;
    Meal m ;
    ArrayList<Item> i;
    /**
     * overloading 
     */
    /**
    * default constructor Not has parameters
    */
    public Customer() {
    }
    /**
     * constructor has parameters ID ,password,UserName,orders,age,name For Customer to Initial.
     * @param ID it is id of customer
     * @param password it is password of customer
     * @param UserName it is UserName of customer
     * @param name it is Name of customer
     * @param age it is Age of customer
     * @param orders it is list orders of customer
     */
    public Customer(String ID, String password, String UserName, String name, int age, ArrayList<Order> orders) {
        super(name, age);
        this.ID = ID;
        this.password = password;
        this.UserName = UserName;
        this.orders = orders;

    }
    /**
     * constructor has parameters ID ,password,UserName For Customer for Initial.
     * @param ID it is id of customer
     * @param password it is password of customer
     * @param UserName it is UserName of customer
     */
    public Customer(String ID, String password, String UserName) {
        this.ID = ID;
        this.password = password;
        this.UserName = UserName;
    }
    /**
    * setter method has parameter to set ID.
    * @param ID it is id of customer
    */
    public void setID(String ID) {
        this.ID = ID;
    }
    /**
    * getter method  to get ID.
    * @return Id of customer 
    */
    public String getID() {
        return ID;
    }
    /**
    * getter method  to get password.
    * @return  password of customer
    */
    public String getPassword() {
        return password;
    }
    /**
    * setter method has parameter to set ID.
    * @param password it is password of customer
    */
    public void setPassword(String password) {
        this.password = password;
    }
    /**
    * setter method  to get UserName.
    * @return  UserName of customer
    */
    public String getUserName() {
        return UserName;
    }
    /**
    * setter method has parameter to set UserName.
    * @param UserName it is  UserName of customer
    */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }
    /**
    * setter method  to get List Of Orders.
    * @return  list of orders
    */
    public ArrayList< Order>  getOrders() {
        return orders;
    }
    /**
    * setter method  to set List Of Orders.
    * @param  orders it is list of orders for customer
    */
    public void setOrder(ArrayList< Order>  orders) {
        this.orders = orders;
    }
    /**
     * this method Report quality issues or a review for customer
     */
    public void Review()
    {
        System.out.println("Report quality issues or a review......");
        String S =input.next();
    }
    /**
    * AddNewOrder method Has parameters  unique code,order data, delivery date using 
    * Data in import java.util.Date
    * inter method input address and number of List Meals
    * and number of items in One meal in List Meals
    * @param  uniCode it is special code for order
    * @param orderDate its date of registration order
    * @param deliveryDate its date of deliveryD order

    */
    public void AddNewOrder(String uniCode,Date orderDate, Date deliveryDate)
    {
         order =new Order(uniCode,orderDate,deliveryDate);
         ArrayList<Meal>ms= new  ArrayList<>();
               int k = 0,k1=0;  
          m = new Meal() ;
          i= new ArrayList<Item>();
                               System.out.print("Enter Your Address You Wont send InOrder :");
                                order.setReceiveOrderAdress(input.next()); 
                                System.out.println("Enter Number Of MealsList You Wont InOrder ");
                                try{
                                 k =input.nextInt();
                                }
                                catch( InputMismatchException  e)
                                {
                                    System.out.println("Input Must Be Interger Number");
                                    System.out.println(e.getMessage());
                                }
                                Item i1 ;
                                for (int j = 0; j< k; j++) {
                                       
                                           System.out.print("Enter ID Of New Meal ");
                                           m.setIDMeal(input.next());
                                           System.out.print("Enter Number Items  Of New Meal ");
                                           try
                                           {
                                               k1 =input.nextInt();
                                           } catch( InputMismatchException  e)
                                           {
                                                 System.out.println("Input Must Be Interger Number");
                                                  System.out.println(e.getMessage());
                                           }
                                           for (int l = 0; l < k1; l++) {
                                               System.out.println("Enter Number for TypeItem---> "
                                                       + "\n 1-appetizers... "
                                                       + "\n 2-desserts......."
                                                       + " \n 3-main dishes....,"
                                                       + "\n 4-drinks.......\n  ");
                                               char c= input.next().charAt(0);
                                               switch(c)
                                               {
                                                    case '1':
                                                    i1=new Item(Category.APPETIZERS);
                                                       break;
                                                    case '2':
                                                    i1=new Item(Category.DESERTS);
                                                       break; 
                                                    case '3':
                                                    i1=new Item(Category.MAINDISHES);
                                                       break; 
                                                    case '4':
                                                   i1=new Item(Category.DRINKS);
                                                       break;
                                                       default:
                                                    i1=new Item(Category.DESERTS);
                                                           break;
                                               }
                                                System.out.println((l+1)+" - Item" );
                                                System.out.print("Name Item :" );
                                                i1.setName(input.next());
                                                try{
                                                System.out.print("NumOfCalories Item :");
                                                i1.setNumOfCalories(input.nextInt());
                                                System.out.print("Portion Item :");
                                                i1.setPortion(input.nextInt());
                                                System.out.print("Price Item :");
                                                i1.setPrice(input.nextFloat());
                                                }catch(InputMismatchException e)
                                                {
                                                 System.out.println("Input Must Be Interger Number");
                                                 System.out.println(e.getMessage());
                                                }
                                                i.add(i1);
                                                System.out.println("-------------------------------------------------------");
                                       }   
                                        m.setItems(i);
                                        ms.add(m);
                                        

                                    }
                                  order.setMeals(ms);
                                System.out.println("                 Done Check..............");
                                System.out.println("============================================");
                                System.out.println("New Order Consist Of "+k+" Meals");
                                order.DisplayLoginData();
                                System.out.println("============================================");
                                orders.add(order);
    }
    /**
    * ExtandOrder method Has parameters  unique code 
    * inter method record this date and check delivery date it doing extend
    * if accepted only before the delivery date by at least 24 hours
    * else can't extend date
    * @param  uniCode it is special Code for one orders
    */
    public  void ExtandOrder(String uniCode)
    {
        Date date1 =new Date();
         int x=0,y=0;
        boolean n=false;
            for (int l = 0; l < orders.size(); l++) {
            if(orders.get(l).getUniqueCode().equals(uniCode))
            { System.out.print("Enter Month For Extand :");
              try{
              x=input.nextInt();
              System.out.print("Enter Day For Extand :");
              y=input.nextInt();
              }catch(InputMismatchException e)
              {
                  System.out.println("Input Must Be Interger Number");
                  System.out.println(e.getMessage());
              }
              System.out.println();
              System.out.println("=================================");
              Date date =new Date(2020, x, y);
              
                if (date1.getMonth()==orders.get(l).getDelivaryOrderData().getMonth())
                {
                    orders.get(l).setDelivaryOrderData(date);
                    System.out.println("Done Extand Time Of Order  !!"); 
                }
                else
                {
                int d=(orders.get(l).getDelivaryOrderData().getDate()) - (date.getDate());
                
                if (d>=1)
                {
                     orders.get(l).setDelivaryOrderData(date);
                    System.out.println("Done Extand Time Of Order  !!"); 
                }
                else
                { 
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Sorry You Can't Extand Time Of Order ......");
                    System.out.println("");
                    System.out.println("You Should Extand Time Of Order Befor a bay (24 Hours)  ......");
                    System.out.println("--------------------------------------------------------------");

                }
                }
                 n=true;
                    break;
            }
         }
        if(n==false)
        {
            System.out.println("Error Not Found This Order");
        }
    }
    /**
    * CancelOrder method Has parameters  unique code 
    * inter method record this date and check delivery date it doing Cancel order
    * if accepted only before the delivery date by at least 24 hours
    * else can't extend date
    * @param uniCode it is special Code for one orders
    * @exception InputMismatchException for customer input number
    */
    public  void CancelOrder(String uniCode)
    {
        Date date = new Date();
        boolean n=false;
        System.out.println(orders.size());
            for (int l = 0; l < orders.size(); l++) {
            if(orders.get(l).getUniqueCode().equals(uniCode))
            { 
                if (date.getMonth()==orders.get(l).getDelivaryOrderData().getMonth())
                {
                    orders.remove(orders.get(l));
                    System.out.println("Done CancelOrder :) !!");
                }
                else
                {
                int d=(orders.get(l).getDelivaryOrderData().getDate()) - (date.getDate());
                
                if (d>=1)
                {

                    orders.remove(orders.get(l));
                    System.out.println("Done CancelOrder :) !!"); 
                }
                else
                {
                    System.out.println("Sorry You Can't CancelOrder ......");
                    System.out.println("You Should CancelOrder Befor a bay (24 Hours)  ......");
                }
                }
                 n=true;
                    break;
            }
         }
        if(n==false)
        {
            System.out.println("Error Not Found This Order");
        }
    }
/**
 *InputMeal method Not Has parameters 
 *using for customer enter information of one meal help Update Order
 * @exception InputMismatchException for customer input number
 * @return meal
 */
    public Meal InputMeal()
    {
       int k=0;
       m= new Meal();
       i= new ArrayList<Item>();
          System.out.print("Enter Type Of ([f] for family or [i] for individual) New Meal : ");
                       if(input.next().charAt(0)=='f'||input.next().charAt(0)=='F')
                       {
                           m.setTypeMeal("Family");
                       }
                       else
                       {
                          m.setTypeMeal("Individual");
                       }
                       System.out.print("Enter ID Of New Meal ");
                       m.setIDMeal(input.next());
                       System.out.print("Enter Number Items  Of New Meal ");
                       try{ 
                       k =input.nextInt();}
                       catch(InputMismatchException e)
                       { System.out.println("Input Must Be Interger Number");
                         System.out.println(e.getMessage());
                       }
                       for (int j = 0; j < k; j++) {
                            Item i1=new Item(Category.DESERTS);
                            System.out.println((j+1)+" - Item" );
                            System.out.print("Name Item :" );
                            i1.setName(input.next());
                            System.out.print("NumOfCalories Item :");
                             i1.setNumOfCalories(input.nextInt());
                            System.out.print("Portion Item :");
                            i1.setPortion(input.nextInt());
                            System.out.print("Price Item :");
                            i1.setPrice(input.nextFloat());
                            i.add(i1);
                            System.out.println("-------------------------------------------------------");

                       }
                
                       m.setItems(i);
                       return m;
    }
   
 /**
  * UpdataOrder method Has parameters  unique code
  * in this method can update by Add new meal to List meal or by Remove meal from list of meals
  * or update meal by remove item from meal or add item to meal
  * @param uncode it is  code of order
  */
    public void UpdataOrder(String uncode)
    {
        boolean n=false;
      
        for (int l = 0; l < orders.size(); l++) {
            if(orders.get(l).getUniqueCode().equals(uncode))
            {            
                System.out.println(" 1-Add Meal..........2- Udata Meal.......... 3- Remove Meal");
                char c = input.next().charAt(0);
                switch(c)
                {
                    case'1':  
                        orders.get(l).AddMeal(InputMeal());
                        break;
                    case'2':
                        System.out.print("Enter ID of Meals : ");
                        orders.get(l).UpdataMeal(input.next());
                        System.out.println("");
                        break;
                    case'3':
                        System.out.print("Enter ID of Meals : ");
                        orders.get(l).RemoveMeal(input.next());
                        System.out.println("");
                        break;
                    default:
                        System.out.println("Error Input");
                        System.out.println("");
                        break;
                }
                n=true;
                break;
            }
            if (n==false)
            {
                System.out.println("Error Not Found UniCode Order...........");
            }

 
        }
    }
/**
 * DisplayOrders method Not Has parameters  
 * in this method Display list of orders for user
 * @throws Exception Not Orders In Your List To Display
 */
    public void DisplayOrders() throws Exception
    {
        if (orders.size()>0)
        {
            for (int i = 0; i < orders.size(); i++) {
            System.out.println("               Order" +(i+1));
            System.out.println("              #############");
            System.out.println(" UnCode Of Order :"+orders.get(i).getUniqueCode());
            System.out.println("");
            System.out.println(" RegisterOrderData Of Order : "+(orders.get(i).getRegisterOrderData().getDate())+"/"+
           orders.get(i).getRegisterOrderData().getMonth()+"/"+orders.get(i).getRegisterOrderData().getYear());
            System.out.println("");
            System.out.println(" DelivaryOrderData Of Order : "+(orders.get(i).getDelivaryOrderData().getDate())+
                    "/"+orders.get(i).getDelivaryOrderData().getMonth()+"/"+orders.get(i).getRegisterOrderData().getYear());
                     System.out.println("");
            System.out.println(" ReceiveOrderAdress Of Order : "+orders.get(i).getReceiveOrderAdress());
            System.out.println("");
            orders.get(i).DisplayLoginData();           
        }
        }
        else 
        {
            System.out.println("");
            throw new Exception("Not Orders In Your List To Display........."); 
            //System.out.println("");

        }
    }
    /**
     * abstract float TatalPrice to calculate total price of list orders and return it
     * @return  total price of list orders for customer
     */
    public abstract float TatalPrice();
}
