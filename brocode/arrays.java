public class arrays {
    public static void main(String[] args) {
        // array = used to store multiple values in a single variable
        // datatype you are entering in values should match datatype of array
        String[] cars = {"Camaro","BMW","Mercedes","Rolls Royce"};
        cars[0] = "Mustang";
        System.out.println(cars[2]);
        String[] bikes = new String[3];
        bikes[0]="Ducati";
        bikes[1]="BMW";
        bikes[2]="Mercedes";
        System.out.println(bikes[2]);

        for(int i=0;i<cars.length;i++){
            System.out.println(cars[i]);
        }
    }
}
