import java.io.Serializable;

public class Product implements Serializable {  //The class for products, a shell for the object

    private String name;                          //Field, instance variables , attribute for the object
    private String type;
    private double price;
    private String unit;
    static int count = 1;
    int idProduct;

    public Product(String name, String type, double price, String unit) {   //constructor
        this.name = name;
        this.type = type;
        this.price = price;
        this.unit = unit;
        this.idProduct = count++;               //This gives the product a individual id

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

    public void setPrice(double newPrice) {
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

    public void setId(int newIdproduct){
        this.idProduct =newIdproduct;
    }
    public int getIdproduct(){

        return this.idProduct;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                ", idproduct=" + idProduct +
                '}' + "\n";
    }
}




