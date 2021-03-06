package ManageTuckShop;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {

    public static ArrayList<Items> item = new ArrayList<>();
    public static ArrayList<Customers> customer = new ArrayList<>();
    public static ArrayList<Partners> partner = new ArrayList<>();
    
    static Scanner sc= new Scanner(System.in);

    static void showMenu(){
        System.out.println("                                 MENU                       ");
        System.out.println("               _____________________*******__________________");
        System.out.println("               || 1.Item|| 2.Customer ||3.Partner || 4.Exit||");
        System.out.println("               _____________________*******__________________");
    }
    static void showMenu1(){
        System.out.println("                              Functions          ");
        System.out.println("                      ----------********----------");
        System.out.println("                      | 1. Add item              |");
        System.out.println("                      | 2. Display item          |");
        System.out.println("                      | 3. Delete item           |");
        System.out.println("                      | 4. Sort item by price    |");
        System.out.println("                      | 5. Sort item by id       |");
        System.out.println("                      | 6. Exit                  |");      
        System.out.println("                      ----------********----------");
    }
    static void showMenu2(){
        System.out.println("                               Functions          ");
        System.out.println("                      ----------********-----------");
        System.out.println("                      | 1. Add customer           |");
        System.out.println("                      | 2. Display customer       |");
        System.out.println("                      | 3. Delete customer        |");
        System.out.println("                      | 4. Sort customer by id    |");
        System.out.println("                      | 5. Exit                   |"); 
        System.out.println("                      ----------*********----------");
    }
    static void showMenu3(){
        System.out.println("                                 Functions        ");
        System.out.println("                      ----------********----------");
        System.out.println("                      | 1. Add partner           |");
        System.out.println("                      | 2. Display partner       |");
        System.out.println("                      | 3. Delete partner        |");   
        System.out.println("                      | 4. Sort partner by id    |");
        System.out.println("                      | 5. Exit                  |");
        System.out.println("                      ----------********----------");
    }
    public static void main(String[] args) {
        
        Items item1 = new Items(112,"B??nh quy Cosy","8933321012507","Vi???t Nam","v??? socola", "H???p gi???y","02/11/2022","02/08/2021",100, 56000);
        Main.item.add(item1);
        Items item2 = new Items(116,"B??nh quy Cosy","8933353412967","Vi???t Nam","v??? qu???", "H???p thi???c","12/02/2022","02/06/2021",100,52000);
        Main.item.add(item2);
        Items item3 = new Items(110,"B??nh b??ng lan Solite","8932871012627","Vi???t Nam","v??? matcha", "H???p thi???c","03/08/2021","01/02/2020",40,53000);
        Main.item.add(item3);
        Items item4 = new Items(114,"B??nh b??ng lan Solite","8933300512570","Vi???t Nam","v??? b?? s???a", "H???p gi???y","12/02/2021","22/08/2020",50,53000);
        Main.item.add(item4);
        Items item5 = new Items(111,"K???o choco","8933350062507","Vi???t Nam","v??? nho", "H???p","08/09/2021","02/08/2020",60, 92000);
        Main.item.add(item5);
        Items item6 = new Items(113,"K???o d???o Haribo Happy","8930055762507","Vi???t Nam","v??? Coca", "T??i","08/11/2022","02/08/2021",60, 24800);
        Main.item.add(item6);
        
        Customers customer1 = new Customers(209,"Ho??ng Ch??nh Ngh??a", 29,"Nam"," T??? do", "0948 057 234", "Qu???n 1","ng11@gmail.com");
        Main.customer.add(customer1);
        Customers customer2 = new Customers(201,"L?? V??n An", 32,"Nam"," Nh??n vi??n v??n ph??ng", "0964 634 234", "Qu???n 1","tug12@gmail.com");
        Main.customer.add(customer2);
        Customers customer3 = new Customers(204,"Ng?? Th??? Lan", 17,"N???"," H???c sinh", "0948 341 300", "Qu???n 2","lan158@gmail.com");
        Main.customer.add(customer3);
        Customers customer4 = new Customers(203,"L?? Tr???ng Huy", 24,"Nam"," Gi??o vi??n", "0925 852 258", "Qu???n 7","sa56@gmail.com");
        Main.customer.add(customer4);
        Customers customer5 = new Customers(206,"Tr???n Hi???n", 21,"N???"," Sinh vi??n", "0986 123 234", "Qu???n 7","tran21@gmail.com");
        Main.customer.add(customer5);

        Partners partner1= new Partners (302,"Tr???n Thanh T??ng","Nam"," CTY CP B??nh K???o Kinh ????", " 028 3827 0838", "TP.HCM","Cuscare.MKDz.com");
        Main.partner.add(partner1);
        Partners partner2= new Partners (303,"Nguy???n H???i Ch??u","Nam"," CTY CP B??nh K???o H???i Ch??u", "0916 315 379", "H?? N???i","hc365@gmail.com");
        Main.partner.add(partner2);
        Partners partner3= new Partners (301,"L?? Th??? V??n Nga","N???"," CTY CP B??nh K???o Bibica", " 028 3971 7920", "TP.HCM"," bg@bibica.com.vn");
        Main.partner.add(partner3);

        Manage manage = new Manage();
        
        int choose = 0;
        do {
            showMenu();
            try {
                choose=sc.nextInt();
                switch(choose){
                    case 1 ->{ 
                        showMenu1();
                        int choose1=0;
                        System.out.println("Select number: ");
                        choose1=sc.nextInt();
                        switch(choose1){
                            case 1->{
                                manage.AddItem();
                                  
                            }
                            case 2->{
                                manage.showItem();
                                
                            }
                            case 3->{
                                manage.deleteItem();
                                manage.showItem();
                            }
                            case 4->{
                                manage.sortByUnit_price();
                                manage.showItem();
                            }
                            case 5->{
                                manage.sortByIdItem(item);
                                manage.showItem();
                            }
                            case 6 ->{
                                System.out.println("Exit");
                            }
                           
                            default->{
                               System.out.println("You just entered the wrong option, please re-enter it");
                            }
                        }
                      
                    }
                    case 2->{
                        showMenu2();
                        int choose2=0;
                        System.out.println("Select number: ");
                        choose2=sc.nextInt();
                        switch(choose2){
                            case 1->{
                                manage.AddCustomer();
                                 
                            }
                            case 2->{
                                manage.showCus();
                                
                            }
                            case 3->{
                                manage.deleteCus();
                                manage.showCus();
                            }
                            case 4->{
                                manage.sortByIdCus(customer);
                                
                            }
                            case 5->{
                                System.out.println("Exit.");
                            }
                            default->{
                                System.out.println("You just entered the wrong option, please re-enter it");
                            }
                        }
                        
                    }
                    case 3->{
                        showMenu3();
                        int choose3=0;
                        System.out.println("Select number: ");
                        choose3=sc.nextInt();
                        switch(choose3){
                            case 1->{
                                manage.AddPartner();
                                
                            }
                            case 2->{
                                manage.showPar();
                                
                            }
                            case 3->{
                                manage.deletePar();
                                manage.showPar(); 
                            }
                            case 4->{
                                manage.sortByIDPar(partner);
                                manage.showPar();  
                            }
                            case 5->{
                                System.out.println("Exit.");
                            }
                            default->{
                                System.out.println("You just entered the wrong option, please re-enter it");
                            }
                        }
                        
                    }
                    case 4->{
                        System.out.println("Exit");
                    }
                    default -> {
                        System.out.println("You just entered the wrong option, please re-enter it");
                    }      
                }
            }catch (InputMismatchException ei) {
                System.out.println("You have entered the wrong value, please re-enter it!  ");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }  
        } while (choose !=5);
        System.out.println("Enter again, please!");
    }
}


