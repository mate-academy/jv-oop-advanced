package core.basesyntax;

public class Rectangle extends Figures {
    private double sideA;
    private double sideB;

    public Rectangle(String name, String color, double sideA, double sideB) {
        super(name, color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure " + getName() + " is " + getColor().toLowerCase()
                + " and has area: " + getArea() + " sq. units, because has sides: "
                + getSideA() + ", " + getSideB());
    }
}
