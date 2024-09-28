package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double upperA; //Length of the upper base
    private final double lowerB; // Length of the lower base
    private final double height; // height
    private String color;

    public IsoscelesTrapezoid(double upperA, double lowerB, double height, String color) {
        this.upperA = upperA;
        this.lowerB = lowerB;
        this.height = height;
        setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscales trapezoid, area: " + getArea()
                + " sq. units, length of the upper base: " + upperA
                + " units, length of the lower base: " + lowerB
                + " units, height: " + height + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return (lowerB + upperA) * height / 2;
    }
}


