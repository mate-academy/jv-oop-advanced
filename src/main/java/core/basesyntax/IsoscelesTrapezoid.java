package core.basesyntax;

public class IsoscelesTrapezoid extends FigureBase {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) / 2 * height;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, firstSide: " + firstSide + " units, secondSide: "
                + secondSide + " units, height: " + height + " units, color: " + color);
    }
}
