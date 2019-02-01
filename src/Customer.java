public class Customer {

    public String name;  //Attribut fält
    public String city;
    public int id;


    public Customer(String name, String city, int id){ //  konstruktor
            this.name = name;
            this.city = city;
            this.id = id;
        }



    public void setName(String newName){   //Setters och getters
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




