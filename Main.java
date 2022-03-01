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
        
        Items item1 = new Items(112,"Bánh quy Cosy","8933321012507","Việt Nam","vị socola", "Hộp giấy","02/11/2022","02/08/2021",100, 56000);
        Main.item.add(item1);
        Items item2 = new Items(116,"Bánh quy Cosy","8933353412967","Việt Nam","vị quế", "Hộp thiếc","12/02/2022","02/06/2021",100,52000);
        Main.item.add(item2);
        Items item3 = new Items(110,"Bánh bông lan Solite","8932871012627","Việt Nam","vị matcha", "Hộp thiếc","03/08/2021","01/02/2020",40,53000);
        Main.item.add(item3);
        Items item4 = new Items(114,"Bánh bông lan Solite","8933300512570","Việt Nam","vị bơ sữa", "Hộp giấy","12/02/2021","22/08/2020",50,53000);
        Main.item.add(item4);
        Items item5 = new Items(111,"Kẹo choco","8933350062507","Việt Nam","vị nho", "Hộp","08/09/2021","02/08/2020",60, 92000);
        Main.item.add(item5);
        Items item6 = new Items(113,"Kẹo dẻo Haribo Happy","8930055762507","Việt Nam","vị Coca", "Túi","08/11/2022","02/08/2021",60, 24800);
        Main.item.add(item6);
        
        Customers customer1 = new Customers(209,"Hoàng Chính Nghĩa", 29,"Nam"," Tự do", "0948 057 234", "Quận 1","ng11@gmail.com");
        Main.customer.add(customer1);
        Customers customer2 = new Customers(201,"Lê Văn An", 32,"Nam"," Nhân viên văn phòng", "0964 634 234", "Quận 1","tug12@gmail.com");
        Main.customer.add(customer2);
        Customers customer3 = new Customers(204,"Ngô Thị Lan", 17,"Nữ"," Học sinh", "0948 341 300", "Quận 2","lan158@gmail.com");
        Main.customer.add(customer3);
        Customers customer4 = new Customers(203,"Lê Trọng Huy", 24,"Nam"," Giáo viên", "0925 852 258", "Quận 7","sa56@gmail.com");
        Main.customer.add(customer4);
        Customers customer5 = new Customers(206,"Trần Hiền", 21,"Nữ"," Sinh viên", "0986 123 234", "Quận 7","tran21@gmail.com");
        Main.customer.add(customer5);

        Partners partner1= new Partners (302,"Trần Thanh Tùng","Nam"," CTY CP Bánh Kẹo Kinh Đô", " 028 3827 0838", "TP.HCM","Cuscare.MKDz.com");
        Main.partner.add(partner1);
        Partners partner2= new Partners (303,"Nguyễn Hải Châu","Nam"," CTY CP Bánh Kẹo Hải Châu", "0916 315 379", "Hà Nội","hc365@gmail.com");
        Main.partner.add(partner2);
        Partners partner3= new Partners (301,"Lê Thị Vân Nga","Nữ"," CTY CP Bánh Kẹo Bibica", " 028 3971 7920", "TP.HCM"," bg@bibica.com.vn");
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


