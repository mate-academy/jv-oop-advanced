package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topSide;
    private double bottomSide;
    private double height;

    public IsoscelesTrapezoid(String color, double smallerSide, double biggerSide, double height) {
        super(color);
        this.topSide = smallerSide;
        this.bottomSide = biggerSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (topSide + bottomSide) / 2 * height;
    }

    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea() + " sq. units, "
                + "smaller side: " + topSide + "units, bigger side: " + bottomSide
                + "units, height: " + height + "units, color: " + color);
    }
}
