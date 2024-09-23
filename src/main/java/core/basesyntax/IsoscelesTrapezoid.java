package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double firstSide;
    private final double secondSide;
    private final double height;

    public IsoscelesTrapezoid(double longerBase, double shorterBase, double height, String color) {
        super(color);
        this.firstSide = longerBase;
        this.secondSide = shorterBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((secondSide + firstSide) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea() + " sq"
                + ", longer base " + firstSide + " units "
                + ", shorter base: " + secondSide + " units "
                + ", height: " + height + " color: " + color);
    }
}
