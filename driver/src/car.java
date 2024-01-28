public class car {
    private String make;
    private String model;
    private int year;
    private String color;
    private boolean frontWheelDrive;

    public car()
    {
    make = "Ford";
    model = "Mustang";
    year = 2012;
    color = "Black";
    frontWheelDrive = false;
    }
    public car(String make, String model, int year, String color, boolean frontWheelDrive)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.frontWheelDrive = frontWheelDrive;

    }
    public car(String make, String model, int year)
    {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = "White";
        this.frontWheelDrive = false;

    }

    public String getMake()
    {
        return make;
    }
    public void setMake(String make)
    {
        this.make = make;
    }
    public String getModel()
    {
        return model;
    }
    public void setModel(String model)
    {
        this.model = model;
    }
    public int getYear()
    {
        return year;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }
    public boolean getfrontWheelDrive()
    {
        return frontWheelDrive;
    }
    public void setFrontWheelDrive(String frontWheelDrive)
    {
        this.frontWheelDrive = false;
    }
    @Override
    public String toString() {
        return "Car{" +
                "make= " + make + '\'' +
                ",model=" + model + '\'' +
                ", year= " + year +
                ", color= " + color + '\'' +
                ", frontWheelDrive=" + frontWheelDrive +
                '}';
    }
    public void speedUp()
    {
        System.out.println("Roarrrrr! Speeeding Up!" );

    }
    public void start()
    {
        System.out.println("Starting car!");
    }
    public void turn(String direction)
    {
        System.out.println("Now turning " + direction);
    }
    public void turnOff(){
        System.out.println("turn off car.");
    }
}
