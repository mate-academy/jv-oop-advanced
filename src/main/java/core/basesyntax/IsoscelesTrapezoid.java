package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int smallerSide;
    private final int biggerSide;
    private final int height;

    public IsoscelesTrapezoid(String color, int smallerSide, int biggerSide, int height) {
        super(color);
        this.smallerSide = smallerSide;
        this.biggerSide = biggerSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (smallerSide + biggerSide) * height * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq. units, "
                + "smaller side: " + smallerSide + " units, bigger side: " + biggerSide
                + " units, height: " + height + " units, color: " + color);
    }
}
