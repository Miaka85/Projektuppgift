import java.io.Serializable;

public class Product implements Serializable {

    private String name;                                                 //attribut
    private String type;
    private double price;
    private String unit;
    static int count = 1;  //This gives the product a individual id
    int idproduct;

    public Product(String name, String type, double price, String unit) {   //construktor
        this.name = name;
        this.type = type;
        this.price = price;
        this.unit = unit;
        this.idproduct = count++;

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
        this.idproduct =newIdproduct;
    }
    public int getIdproduct(){

        return this.idproduct;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", unit='" + unit + '\'' +
                ", idproduct=" + idproduct +
                '}' + "\n";
    }
}




