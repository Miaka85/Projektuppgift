public class Product {

    private String name;                                                 //attribut
    private String type;
    private float price;
    private String unit;
    static int count = 1;  //This gives the product a individual id
    int id;

    public Product(String name, String type, float price, String unit) {   //construktor
        this.name = name;
        this.type = type;
        this.price = price;
        this.unit = unit;
        this.id = count++;

    }

    public void setname(String newName) {
        this.name = newName;                                             //setters getters
    }

    public String getName() {
        return name;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public String gettype() {
        return type;
    }

    public void setPrice(float newPrice) {
        this.price = newPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setUnit(String newUnit){
    }

    public String getUnit() {
        return unit;
    }

    public void setId(int newId){
        this.id =newId;
    }
    public int getId(){

        return this.id;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                ", id=" + id +
                '}';
    }
}




