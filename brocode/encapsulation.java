public class encapsulation {
    public static void main(String[] args) {
        
        /* Encapsulation = attributes of a class will be hidden or private,
                           Can be accessed only through methods(getters & setters)
                           You should make attributes private if you don't have a reason to make them public/protected. */
        Car car = new Car("Chevrolet","Camaro",2022);  
        System.out.println(car.getMake()); // Getter Method - for accesing visibility private attributes
        System.out.println(car.getModel());

        car.setYear(2021);
        System.out.println(car.getYear());
    }
}

class Car{
    private String make;
    private String model;
    private int year;

    Car(String make,String model,int year){
        this.setMake(make);
        this.setModel(model);
        this.setYear(year);
    }

    //Getter Methods
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }

    //Setter Methods
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setYear(int year){
        this.year = year;
    }    
}
