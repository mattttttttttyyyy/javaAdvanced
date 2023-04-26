package org.example.workshop;

//8. Workshop
//        Prepare a program in which you will simulate a situation when
//        a car driver catches a flat tire and takes it to the workshop for repair.
//        - in main prepare four Wheel objects, pressure of each of them
//        must be set to default value, and they are not pierced,
//        - collect all the wheels into an array and pass it to the Car object,
//        - simulate the event that the car gets a flat tire in a random wheel,
//        - a Workshop object can accept a car for repair,
//        - the repair is that the workshop finds which wheel from the car is broken and fixes it,
//        - at the end of the repair, the workshop returns an object of the
//        Receipt type containing the type of service, how many times it was
//        performed and the total price.



public class Workshop {
    public Workshop() {
    }

    public static void acceptCar(){
        System.out.println("Car accepted!");
    }

    public static void inspectCarAndFix(Car car){
        for(int i = 0; i < 3; i++){
            if (car.eachTire(i) < 1){
                System.out.println("Tire " + i + " needs fixing!");
                while (car.eachTire(i) < 2.5){
                    car.pumpingTire(i, 0.5);
                    System.out.println("Pumping! Pressure: "+ car.eachTire(i));
                }
            }
        }
        System.out.println("Car is fixed, current tire pressure: ");
        car.tireStatus();
    }





}
