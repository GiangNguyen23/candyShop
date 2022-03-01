package ManageTuckShop;

public abstract class Person {
    private String name;
    private String gender;
    private String phone;
    private String address;
    private String email;

    public abstract String toString();

    public Person(){
    }
    
    public Person(String name, String gender,String phone,String address, String email) {
        this.name = name;
        this.gender=gender;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getName(){
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getPhone(){
        return phone;
    }
    public String getAddress(){
        return address;
    }
    public String getEmail(){
        return email;
    }
    
}
