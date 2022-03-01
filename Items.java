package ManageTuckShop;

public class Items {
    private int item_id;
    private String item_name;//Tên mặt hàng
    private String serial;//Mã định danh của sản phẩm

    private String item_type;//loại mặt hàng
    private String unit;//Đơn vị(VD: Hộp, túi, gói)
    private String origin;//xuất xứ

    private String exp;//HSD
    private String import_date;//ngày nhập hàng

    private int amount;//số lượng hàng nhập vào
    private float unit_price=0.000f;//Đơn giá/1 sản phẩm

    public Items() {
    }
    public Items(int item_id, String item_name, String serial, String origin,
            String item_type, String unit, String exp,
            String import_date, int amount,float unit_price) {

        this.item_id = item_id;
        this.item_name = item_name;
        this.serial = serial;

        this.origin=origin;
        this.item_type = item_type;
        this.unit = unit;
        this.exp= exp;
        
        this.unit_price = unit_price;
        this.import_date = import_date;
        this.amount = amount;
    }
    public void setItem_id(int item_id){
        this.item_id=item_id;
    }
    public int getItem_id(){
        return item_id;
    }
    public void setItem_name(String item_name){
        this.item_name=item_name;
    }
    public String getItem_name(){
        return item_name;
    }
    public void setSerial(String serial){
        this.serial=serial;
    }
    public String getSerial(){
        return serial;
    }
    public void setItem_type(String item_type){
        this.item_type=item_type;
    }
    public String getItem_type(){
        return item_type;
    }
    public void setUnit(String unit){
        this.unit=unit;
    }
    public String getUnit(){
        return unit;
    }
    public String getExp() {
        return exp;
    }
    public void setExp(String exp) {
        this.exp = exp;
    }
    
    public void setImport_date(String import_date){
        this.import_date=import_date;
    }
    public String getImport_date(){
        return import_date;
    }
    public void setAmount(int amount){
        this.amount=amount ;
    }
    public int getAmount(){
        return amount;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public void setUnit_price(float retail_price){
        this.unit_price=retail_price;
    }
    public float getUnit_price(){
        return unit_price;
    }
    public void showItem(){
        System.out.printf("|%-7d%-22s%-15s%-17s%-15s%-14s%-14s%-14s%-10d%-6.2f |",getItem_id(),getItem_name(),
            getItem_type(),getSerial(),getOrigin(),getUnit(),getExp(),getImport_date(),getAmount(),getUnit_price());
    }
}
