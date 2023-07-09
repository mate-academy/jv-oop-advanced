package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double baseOne;
    private double baseTwo;
    private double height;

    public IsoscelesTrapezoid(double baseOne, double baseTwo, double height, String color) {
        super(color);
        this.baseOne = baseOne;
        this.baseTwo = baseTwo;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (baseOne + baseTwo) * height / 2;
    }

    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + ", base1: " + baseOne + " , base2: " + baseTwo
                + " , height: " + height + " , color: " + color);
    }
}
