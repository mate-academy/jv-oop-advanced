package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        super(color);
        this.firstBase = base1;
        this.secondBase = base2;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (0.5) * height * (firstBase + secondBase);
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid information: " + "\n"
                + "Color: " + getColor() + ", "
                + "First Base: " + firstBase + ", "
                + "Second Base:" + secondBase + ", "
                + "Area of IsoscelesTrapezoid: " + getArea() + "\n");
    }
}
