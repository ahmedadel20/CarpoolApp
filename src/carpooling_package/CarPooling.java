package carpooling_package;

import java.util.Scanner;

public class CarPooling {

    public static void main(String[] args) {
        // TODO code application logic here
        
        //Passenger Array Info
        Passenger[] passengers = new Passenger[10];

        Subscriber sub = new Subscriber("Ahmed" , 20 , 5);
        passengers[0] = sub;
//        passengers[0].display();
        
        Subscriber sub2 = new Subscriber("Adel" , 50 , 10);
        passengers[1] = sub2;
//        passengers[1].display();
        
        Subscriber sub3 = new Subscriber("Mohamed" , 22 , 15);
        passengers[2] = sub3;
//        passengers[2].display();
        
        Subscriber sub4 = new Subscriber("John Titor" , 50 , 20);
        passengers[3] = sub4;
//        passengers[3].display();
        
        Subscriber sub5 = new Subscriber("Suzy" , 65 , 25);
        passengers[4] = sub5;
//        passengers[4].display();
        
        Subscriber sub6 = new Subscriber("Dianne" , 80 , 20);
        passengers[5] = sub6;
//        passengers[5].display();
        
        Non_Subscriber nsub = new Non_Subscriber("Omar" , 23 , 12);
        passengers[6] = nsub;
//        passengers[6].display();
        
        Non_Subscriber nsub1 = new Non_Subscriber("Yousef" , 30 , 15);
        passengers[7] = nsub1;
//        passengers[7].display();
        
        Non_Subscriber nsub2 = new Non_Subscriber("Zakaria" , 50 , 18);
        passengers[8] = nsub2;
//        passengers[8].display();
        
        Non_Subscriber nsub3 = new Non_Subscriber("Amr" , 75 , 20);
        passengers[9] = nsub3;
//        passengers[9].display();
        
        //Car Array and Info
        Car[] cars = new Car[10];
        
//        String Code, String src , String dest , int numoftrips_Day, String driver_name, int capacity
        Car c1 = new Car("SHOBRA" , "New-Cairo" , 2 , "Mahmoud" , 1);
        cars[0] = c1;
//        cars[0].display();
        
        Car c2 = new Car("Cairo" , "Alexandria" , 1 , "Khaled" , 3);
        cars[1] = c2;
//        cars[1].display();
        
        Car c3 = new Car("Fayom" , "Maadi" , 9 , "Mohamed" , 2);
        cars[2] = c3;
//        cars[2].display();
        
        Car c4 = new Car("SHOBRA" , "Nasr City" , 2 , "Irfan" , 1);
        cars[3] = c4;
//        cars[3].display();
        
        Car c5 = new Car("SHOBRA" , "Nasr City" , 2 , "Irfan" , 1);
        cars[3] = c5;
        
        Car c6 = new Car("SHOBRA" , "Nasr City" , 2 , "Irfan" , 1);
        cars[3] = c6;
        
        Car c7 = new Car("SHOBRA" , "Nasr City" , 2 , "Irfan" , 1);
        cars[3] = c7;
        
        Car c8 = new Car("SHOBRA" , "Nasr City" , 2 , "Irfan" , 1);
        cars[3] = c8;
        
        Car c9 = new Car("SHOBRA" , "Nasr City" , 2 , "Irfan" , 1);
        cars[3] = c9;
        
        Car c10 = new Car("SHOBRA" , "Nasr City" , 2 , "Irfan" , 1);
        cars[9] = c10;
//        passengers[6].subscribe(); //this works
//        passengers[6].display();
//        passengers[6].unsubscribe(); //this works
//        passengers[6].display();
//        System.out.print("----------------------------------");
        passengers[6].routeSearch("SHOBRA", "New-Cairo", cars); //this works
//        System.out.println();
        passengers[6].reservation(cars[0]);
        passengers[6].giveReview(cars[0]);
        passengers[6].display();
//        passengers[6].routeSearch(cars);
//        passengers[0].routeSearch("Fayom", "New- Cairo", cars); //this works
//        System.out.println();
//        passengers[0].reservation(cars[0]);
//        System.out.println();
//        System.out.print("----------------------------------");
//        passengers[6].routeSearch("SHOBRA ", "Nasr City", cars); //this works
//        System.out.println();
//        passengers[6].reservation(cars[0]);
//        passengers[1].routeSearch("SHOBRA", "New-Cairo", cars); //this works
//        System.out.println();
//        passengers[1].reservation(cars[0]);
    }
    
}

//Vehicle is an interface
interface Vehicle {
    public void setRoute(Route route);
    public void setDriver_name(String driver_name);
    public void setNumoftrips_Day(int numoftrips_Day);
    public void setCapacity(int capacity);
    public Route getRoute();
    public String getDriver_name();
    public int getNumoftrips_Day();
    public int getCapacity();
}

class Route {
    private String source;
    private String destination;

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }
    
    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

}

class Car implements Vehicle{

    static public int counter = 0;//Static data member
    private int code = 0;
    private int numoftrips_Day;
    final private int set_max_cap;
    private Route route;
    private String driver_name;
    private int capacity;

    public Car(String src , String dest , int numoftrips_Day, String driver_name, int capacity) {
        this.code = counter; //calculated data member
        counter++; //calculated data member
        Route r = new Route();
        r.setDestination(dest);
        r.setSource(src);
        this.route = r;
        this.numoftrips_Day = numoftrips_Day;
        this.driver_name = driver_name;
        this.capacity = capacity;
        this.set_max_cap = capacity;
    }

    @Override
    public void setRoute(Route route) {
        this.route = route;
    } //Overriding method

    @Override
    public void setDriver_name(String driver_name) {
        this.driver_name = driver_name;
    } //Overriding method

    @Override
    public void setNumoftrips_Day(int numoftrips_Day) {
        this.numoftrips_Day = numoftrips_Day;
    } //Overriding method

    @Override
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    } //Overriding method

    @Override
    public Route getRoute() {
        return route;
    } //Overriding method

    @Override
    public String getDriver_name() {
        return driver_name;
    } //Overriding method

    @Override
    public int getNumoftrips_Day() {
        return numoftrips_Day;
    } //Overriding method

    @Override
    public int getCapacity() {
        return capacity;
    } //Overriding method

    public int getSet_max_cap() {
        return set_max_cap;
    }

    public int getCode() {
        return code;
    }
    
    static public int get_counter(){
        return counter;
    } //static method
    
    public void display(){
        System.out.print("----------------------------------");
        System.out.print("Driver's Name : " + driver_name);
        System.out.println();
        System.out.print("Car Code : " + code);
        System.out.println();
        System.out.print("Route : ");
        System.out.print(route.getSource() + " to " + route.getDestination());
        System.out.println();
        System.out.print("Available Trips : " + numoftrips_Day);
        System.out.println();
        System.out.print("Free-capacity : " + capacity);
        System.out.println();
        System.out.print("----------------------------------");
        System.out.println();
    }
}

class Ticket {

    private int car_code;
    private double price;

    public void setCar_code(int car_code) {
        this.car_code = car_code;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCar_code() {
        return car_code;
    }

    public double getPrice() {
        return price;
    }
}

//Passenger class is an Abstract class
//Open for Extension , Closed for Modification design principle
abstract class Passenger {

    //name is a final variable
    private final String name;
    private final int age;
    private boolean patron;
    private final int reserved_trips;
    private double sub_fees;
    private Ticket ticket = new Ticket();
    private Boolean route_check;
    private String review;

    public Passenger(String name, int age , boolean patron , int trips) {
        this.name = name;
        this.age = age;
        this.patron = patron;
        this.reserved_trips = trips;
        this.route_check = false;
        ticket.setCar_code(-1);
        ticket.setPrice(0);
        if(patron == true){
            this.sub_calc();
        }
        else
            this.sub_fees = 0; 
    }
    
    protected final void sub_calc(){
        if(this.patron == true){
            double base_fees = 300;
            double temp = (double)(((this.age*0.1)+ (this.reserved_trips*0.1))/100)*base_fees;
            this.sub_fees =(double)(base_fees - temp);
                }
        else
            this.sub_fees = 0;
    } //different access modifiers and a final method

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isPatron() {
        return patron;
    }

    public int getReserved_trips() {
        return reserved_trips;
    }

    public double getSub_fees() {
        return sub_fees;
    }
    
    public void routeSearch(String src , String dest , Car[] cars){
        boolean flag = false;
        
        for (Car car : cars) {
            if(car == null){
                break;
            }
            if(car.getRoute().getSource().equals(src) && car.getRoute().getDestination().equals(dest) && car.getNumoftrips_Day() > 0)
            {
                car.display();
                this.route_check = true;
                flag = true;
            }
        }
            if(!flag){
                System.out.print("No Cars were found with the specified route");
                this.route_check = false;
            }
        }
    
    public void routeSearch(Car[] cars){
        for (Car car : cars) {
            if(car == null){
                break;
            }
            car.display();
        }
    } //Method Overloading
    
    public void reservation(Car car) {
        if(!this.route_check){
            System.out.print("Sorry , Reservation failed !");
        }
        else{
            if (car.getNumoftrips_Day() > 0) {
                if (car.getCapacity() > 0) {
                    int max_cap = car.getCapacity();
                    car.setCapacity(--max_cap);
                    if(car.getCapacity() == 0){
                        int tot_trips = car.getNumoftrips_Day();
                        car.setNumoftrips_Day(--tot_trips);
                        car.setCapacity(car.getSet_max_cap());
                    }
                    System.out.print("Please enter the distance in km : ");
                    ticket.setCar_code(car.getCode());
                    Scanner scan = new Scanner(System.in);
                    double dist = scan.nextDouble();
                    if(dist < 1 || dist > 100){ //if the user enters a distance less than 1 or more than 100
                        throw new NumberFormatException();
                    }
                    if(patron){
                    double price =(double)((15 + 10*dist)*0.5);
                    ticket.setPrice(price);
                    }
                    else{
                        double price =(double)((15 + 10*dist));
                        ticket.setPrice(price);
                    }
                    System.out.print("You have reserved a ticket in a car");
                    System.out.println();
                    System.out.print("Ticket Code : " + ticket.getCar_code());
                    System.out.println();
                    System.out.print("Ticket Price : " + ticket.getPrice());
                    System.out.println();
                }
            }
            else{
                System.out.print("There are no available cars to ride !");
            }
        }
    }

    public void subscribe() {
        if (this.patron == true) {
            System.out.print("This Passenger is already subscribed");
        } else {
            this.patron = true;
            sub_calc();
        }
    }

    public void unsubscribe() {
        if (patron == false) {
            System.out.print("This Passenger is not subscribed");
        } else {
            patron = false;
            sub_calc();
        }
    }
    
    public void giveReview(Car car){
        if(ticket.getPrice() > 0){
            Scanner scan = new Scanner(System.in);
            System.out.print("Please , Write the Review below : ");
            String rev = scan.nextLine();
            this.review = rev;
        }
        else{
            System.out.print("Sorry , but you have not reserved this car before !");
        }
    }

    public Boolean getRoute_check() {
        return route_check;
    }
    
    public void display(){
        System.out.print("----------------------------------");
        System.out.print("Name : " + name);
        System.out.println();
        System.out.print("Age : " + age);
        System.out.println();
        System.out.print("Patron : " + patron);
        System.out.println();
        System.out.print("Reserved trips : " + reserved_trips);
        System.out.println();
        System.out.print("Subscription Fees : " + sub_fees);
        System.out.println();
        if(ticket.getPrice() > 0){
            System.out.print("Ticket Code : " + ticket.getCar_code());
            System.out.println();
            System.out.print("Ticket Price : " + ticket.getPrice());
            System.out.println();
        }
        System.out.print("----------------------------------");
        System.out.println();
        if(review != null){
            System.out.print("Review : " + review);
            System.out.println();
        }
    }
}

class Subscriber extends Passenger{
    private final double discount;
    public Subscriber(String name , int age , int num_of_trips) {
        super(name, age, true , num_of_trips);
        discount = 0.5; //calculated data member
    }
    
    //Overriding method
    @Override
    public void reservation(Car car){
        if(!this.getRoute_check()){
        System.out.print("Sorry , reservation has failed !");
    }
        else{
            if (car.getNumoftrips_Day() > 0x0) {
                if (car.getCapacity() > 0) {
                    int max_cap = car.getCapacity();
                    car.setCapacity(--max_cap);
                    if(car.getCapacity() == 0){
                        int tot_trips = car.getNumoftrips_Day();
                        car.setNumoftrips_Day(--tot_trips);
                        car.setCapacity(car.getSet_max_cap());
                    }
                    System.out.print("Please enter the distance in km : ");
                    Ticket t = new Ticket();
                    t.setCar_code(car.getCode());
                    Scanner scan = new Scanner(System.in);
                    double dist = scan.nextDouble();
                    if(this.isPatron()){
                        double price =(double)((15 + 10*dist)*discount);
                        t.setPrice(price);
                    }
                    else{
                        double price =(double)((15 + 10*dist));
                        t.setPrice(price);
                    }
                    System.out.println();
                    System.out.print("You have reserved a ticket in a car");
                    System.out.println();
                    System.out.print("Ticket Code : " + t.getCar_code());
                    System.out.println();
                    System.out.print("Ticket Price : " + t.getPrice());
            }
        }
            else{
                System.out.print("There are no available cars to ride !");
            }
    }
    }
        
}

class Non_Subscriber extends Passenger{

    public Non_Subscriber(String name, int age , int num_of_trips) {
        super(name, age, false , num_of_trips);
    }
}


