package ManageTuckShop;

public class Partners extends Person{
    protected int par_id;//par_id: id của đối tác
    protected String company;

    public Partners(){
        super();
    }

    public Partners(int par_id, String company) {
        this.par_id = par_id;
        this.company = company;
    }

    public Partners( int par_id, String name, String gender,String company, String phone,
            String address, String email) {
        super(name, gender, phone, address, email);
        this.par_id = par_id;
        this.company = company;
    }
    public int getPar_id(){
        return par_id;
    }
    public void setPar_id(int par_id){
        this.par_id=par_id;
    }
    public String getCompany(){
        return company;
    }
    public void setCompany(String company){
        this.company=company;
    }
    
    @Override
    public String toString(){
        return "ID_partner: "+par_id+ "Name Partner: " + super.getName()+
        " Phone: "+ super.getPhone()+" Address: " + super.getAddress() +" Email: "
        + super.getEmail()+" Company: "+company;
    }
}
