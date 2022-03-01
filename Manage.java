package ManageTuckShop;

import java.util.Scanner;
import java.util.ArrayList;

public class Manage {
    static Scanner sc = new Scanner(System.in);
// Items
    // Thêm mặt hàng vào danh sách
    public void AddItem(){
        System.out.println("The number of the item: ");
        int a = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<a; i++){
            System.out.println("Enter ID item: ");
            int item_id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Name item: ");
            String item_name = sc.nextLine();

            System.out.println("Enter item type:");
            String item_type = sc.nextLine();

            System.out.println("Enter serial: ");
            String serial = sc.nextLine();
          
            System.out.println("Enter origin");
            String origin = sc.nextLine();

            System.out.println("Enter unit: ");
            String unit = sc.nextLine();
            System.out.println("Expiry Date: ");
            String exp = sc.nextLine();

            System.out.println("Enter import date: ");
            String import_date= sc.nextLine();

            System.out.println("Enter amount: ");
            int amount =  sc.nextInt();
            sc.nextLine();
            System.out.println("Enter unit price: ");
            float unit_price = sc.nextFloat();
            sc.nextLine();
            Items items = new Items(item_id, item_name, serial, origin,
            item_type, unit, exp, import_date, amount, unit_price);
            
            Main.item.add(items);
        }
    }
    //Hiển thị thông tin của các sản phẩm
    public void showItem(){
        System.out.println("\t\t\t                                TABLE OF ITEM ");
        System.out.println(" ID    \tName item       \tItem type   \tSerial\t\tOrigin\t\tUnit    \tEXP   \tImport date   Amount\tUnit price");
        for (Items i : Main.item) i.showItem();
    }
    // Xóa sản phẩm khỏi danh sách
    public void deleteItem(){
        System.out.println("Enter id of item need to delete: ");
        int item_id = sc.nextInt();
        int inc = 0;
        for (Items i : Main.item){
            if (i.getItem_id() == item_id){
                Main.item.remove(i);
                inc++;
                break;
            }
        }
        if (inc ==0){
            System.out.println("Does not exist.");
        }
        
    }
   
    //Sắp xếp các mặt hàng theo có đơn giá từ thấp-> cao
    public void sortByUnit_price() {
        for (int i = 0; i < Main.item.size(); i++) {
            for (int j = 0; j < Main.item.size(); j++) {
                if (Main.item.get(i).getUnit_price() < Main.item.get(j).getUnit_price()) {
                    Items temp = Main.item.get(j);
                    Main.item.set(j, Main.item.get(i));
                    Main.item.set(i, temp);

                }
            }
        }
    }
    //Sắp xếp các mặt hàng theo id
    public void sortByIdItem(ArrayList<Items> item){
        for (int i = 0; i < item.size() - 1; i++)
            for (int j = 0; j < item.size() - i - 1; j++)
                if (item.get(j).getItem_id() > item.get(j+1).getItem_id()){
                    Items temp = item.get(j);
                    item.set(j,item.get(j+1));
                    item.set(j+1, temp);
                }
    }
    ////////////////////////////////////////////////////////////////
// Customers
    //Thêm khách hàng vào danh sách
    public void AddCustomer(){
        System.out.println("The number of the customers: ");
        int b = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<b; i++){
            System.out.println("Enter ID customer: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter customer of name: ");
            String CusName = sc.nextLine();

            System.out.println("Enter gender: ");
            String gender = sc.nextLine();
            System.out.println("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter job: ");
            String jobOfCus = sc.nextLine();
            System.out.println("Enter address: ");
            String address = sc.nextLine();

            System.out.println("Enter phone: ");
            String phone = sc.nextLine();
            System.out.println("Enter email: ");
            String email = sc.nextLine();

            Customers customers = new Customers(id, CusName, age, gender, jobOfCus, phone, address, email);
            Main.customer.add(customers);    
        }
    }

    //Hiển thị thông tin khách hàng
    public void showCus(){
        System.out.println("\t\t                                         Table of customer ");
        System.out.printf("%-8s%-23s%-5s%-10s%-24s%-16s%-14s%-20s\n","ID","Name customer","Age","Gender","Job","Phone","Address","Email");
        for (Customers i : Main.customer){
            System.out.printf("%-8d%-23s%-5d%-10s%-24s%-16s%-14s%-20s\n",i.getCus_id(),i.getName(),
                i.getAge(),i.getGender(),i.getJobOfCus(),i.getPhone(),i.getAddress(),i.getEmail());
        }
    }

    //Xóa khách hàng khỏi danh sách
    public void deleteCus(){
        System.out.println("Enter id of customer need to delete: ");
        int cus_id = sc.nextInt();
        int inc = 0;
        for (Customers i : Main.customer){
            if (i.getCus_id() == cus_id){
                Main.customer.remove(i);
                inc++;
                break;
            }
        }
        if (inc ==0){
            System.out.println("Does not exist.");
        }
    }

    //Sắp xếp khách hàng theo id
    public void sortByIdCus(ArrayList<Customers> customer){
        for (int i = 0; i < customer.size() - 1; i++)
            for (int j = 0; j < customer.size() - i - 1; j++)
                if (customer.get(j).getCus_id() > customer.get(j+1).getCus_id()){
                    Customers temp = customer.get(j);
                    customer.set(j,customer.get(j+1));
                    customer.set(j+1, temp);
                }
    }
    
    /////////////////////////////////////////////////////////////////////////////
// Partners
    //Thêm đối tác
    public void AddPartner(){
        System.out.println("The number of the partners: ");
        int c = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<c; i++){
            System.out.println("Enter ID partner: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter partner of name: ");
            String name = sc.nextLine();

            System.out.println("Enter gender: ");
            String gender = sc.nextLine();
        
            System.out.println("Enter company: ");
            String company = sc.nextLine();
            System.out.println("Enter phone: ");
            String phone = sc.nextLine();

            System.out.println("Enter address: ");
            String address = sc.nextLine();
            System.out.println("Enter email: ");
            String email = sc.nextLine();

            Partners partners = new Partners(id, name, gender, company, phone, address, email);
            Main.partner.add(partners);    
        }
    }

    //Hiển thị thông tin đối tác
    public void showPar(){
        System.out.println("\t\t                       Table of partner ");
        System.out.printf("%-7s%-19s%-13s%-32s%-17s%-14s%-20s\n","ID","Name partner","Gender","Company","Phone","Address","Email");
        for (Partners i : Main.partner) {
            System.out.printf("%-7d%-19s%-13s%-32s%-17s%-14s%-20s\n",i.getPar_id(),i.getName(),i.getGender(),
                    i.getCompany(),i.getPhone(),i.getAddress(),i.getEmail());
        }
    }

    //Xóa thông tin của đối tác
    public void deletePar(){
        System.out.println("Enter id of partner need to delete: ");
        int par_id = sc.nextInt();
        int inc = 0;
        for (Partners i : Main.partner){
            if (i.getPar_id() == par_id){
                Main.partner.remove(i);
                inc++;
                break;
            }
        }
        if (inc ==0){
            System.out.println("Does not exist.");
        }
    }

    //Sắp xếp đối tác theo id
    public void sortByIDPar(ArrayList<Partners> partner){
        for (int i = 0; i < partner.size() - 1; i++)
            for (int j = 0; j < partner.size() - i - 1; j++)
                if (partner.get(j).getPar_id() > partner.get(j+1).getPar_id()){
                    Partners temp = partner.get(j);
                    partner.set(j,partner.get(j+1));
                    partner.set(j+1, temp);
                }
    }
}


