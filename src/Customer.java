public class Customer {

    private String name;  // fält
    private String city;
    static int count = 1;  //kan man ge unikt id såhär??
    int id;


    public Customer(String name, String city){ // konstruktor
            this.name = name;
            this.city = city;
            this.id = count++;
        }



    public void setName(String newName){
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setCity(String newCity){
        this.city = newCity;
    }
    public String getCity() {
        return this.city;
    }

    public void setId(int newId){
        this.id =newId;
    }
    public int getId(){

        return this.id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", id=" + id +
                '}';
    }
}




