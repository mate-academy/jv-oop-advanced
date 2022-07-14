package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private final double height;
    private final double firstSide;
    private final double secondSide;

    public IsoscelesTrapezoid(String color, double height, double firstSide, double secondSide) {
        super(color);
        this.height = height;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        double constanta = 2.0;
        return (firstSide + secondSide) / constanta * height;
    }

    @Override
    public void print() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + getArea()
                + " sq.units, height: "
                + height
                + ", first side: "
                + firstSide
                + " units, last side: "
                + secondSide
                + " units, color: "
                + getColor()
        );
    }
}
