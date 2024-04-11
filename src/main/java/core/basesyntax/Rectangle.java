package core.basesyntax;

public class Rectangle extends Figure {

    private final double firstSide;
    private final double secondSide;

    private final double area;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = Math.ceil(firstSide * 10) / 10;
        this.secondSide = Math.ceil(secondSide * 10) / 10;
        this.area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return Math.ceil((firstSide * secondSide) * 10) / 10;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: Rectangle, area: " + area + " sq. units, firstSide: " + firstSide
                + ", secondSide: " + secondSide + ", color: " + getColor());
    }
}
