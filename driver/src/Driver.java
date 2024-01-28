import java.util.Scanner;
public class Driver {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        car myCar = createACar(keyboard);
       driveCar(myCar);
       car yourCar = createACar(keyboard);
       driveCar(yourCar);

    }
    public static car createACar(Scanner keyboard)
    {
        String make, model, color;
        int year;
        boolean isFrontWheelDrive;
        System.out.println("Now creating another car");

        System.out.println("What is the make of your dream car?");
        make = keyboard.nextLine();
        System.out.println(" What is the model of your dream car?");
        model = keyboard.nextLine();
        System.out.println("What is the year of your car?");
        year = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("What is the color of your dream car?");
        color = keyboard.nextLine();
        System.out.println("Is your car a front wheel drive ? (true or false)");
        isFrontWheelDrive = keyboard.nextBoolean();
        keyboard.nextLine();

        car aCar = new car(make, model, year, color, isFrontWheelDrive);

        return aCar;

    }
    public static void driveCar(car aCar)
    {
        System.out.println("About to drive a car ..." + aCar);
        aCar.start();
        aCar.speedUp();
        aCar.turn("Left");
        aCar.speedUp();
        aCar.turnOff();
    }
}
