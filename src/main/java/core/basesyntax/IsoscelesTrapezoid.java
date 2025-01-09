package core.basesyntax;

public class IsoscelesTrapezoid extends ColoredFigure {
    private int firstBase;
    private int secondBase;
    private int height;

    public IsoscelesTrapezoid(int sideA, int sideB, int height, String color) {
        super(color);
        this.firstBase = sideA;
        this.secondBase = sideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((firstBase + secondBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea()
                + " sq. units, first base: " + firstBase + " units, second base: "
                + firstBase + " units, color: " + getColor());
    }
}
