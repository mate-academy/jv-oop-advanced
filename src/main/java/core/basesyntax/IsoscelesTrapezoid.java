package core.basesyntax;

public class IsoscelesTrapezoid extends Figures {
    private double sideA;
    private double sideB;
    private double height;

    public IsoscelesTrapezoid(String name, String color,
                              double sideA, double sideB, double height) {
        super(name, color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure " + getName() + " is " + getColor().toLowerCase()
                + " and has area: " + getArea() + " sq. units, because has sides: "
                + getSideA() + ", " + getSideB() + " and height: " + getHeight());
    }
}
