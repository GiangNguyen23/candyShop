package ManageTuckShop;

public class Customers extends Person {
    private int cus_id;
    private String jobOfCus;
    private int age;

    public Customers(){
        super();
    }
    
    public Customers(int cus_id,String name, int age, String gender, String jobOfCus,
                String phone, String address, String email) {
        super(name, gender, phone, address, email);
        this.cus_id = cus_id;
        this.jobOfCus = jobOfCus;//Nghề nghiệp của khách hàng
        this.age = age;
    }
    public int getCus_id(){
        return cus_id;
    }
    public void setCus_id(int cus_id){
        this.cus_id=cus_id;
    }
    public String getJobOfCus(){
        return jobOfCus;
    }
    public void setJobOfCus(String jobOfCus){
        this.jobOfCus=jobOfCus;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    
    @Override
    public String toString(){
        return " ID customer: "+cus_id+" Name of customer: " + super.getName()
        +" Age: "+age+ " Gender: "+ super.getGender()+" Job of Customer: "+ jobOfCus +
        " Phone: "+ super.getPhone()+" Address: " + super.getAddress() 
        +" Email: "+ super.getEmail();
    }
 
}
