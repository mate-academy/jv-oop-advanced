package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: rectangle,"
                                        + "color: %s, first side: %.2f, "
                                        + "second side: %.2f, area: %.2f",
                                        this.color, this.firstSide,
                                        this.secondSide, this.getArea()));
    }
}
