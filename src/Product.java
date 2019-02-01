public class Product {

    private String name;                                                 //attribut
    private String type;
    private float price;
    private String units;


    public Product() {   //konstruktor
        this.name = name;
        this.type = type;
        this.price = price;
        this.units = units;
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

    public void setUnits(String newUnits){
    }

    public String getUnits() {
        return units;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", units='" + units + '\'' +
                '}';
    }
}



