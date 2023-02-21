 class Car {
    int price;
    String name;

    public void printInfo(){
        System.out.println("This is"+this.name+" Car and price is "+this.price);
    }
    public void drivingCar(){
        System.out.println("driving your favorite car");
    }
}


public class Properties {
    public static void main(String[] args){
        Car obj = new Car();
        obj.price = 10000000;
        obj.name = "rangerover";

        obj.printInfo();
        obj.drivingCar();

    }
}

