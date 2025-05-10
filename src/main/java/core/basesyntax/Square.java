package core.basesyntax;

public class Square extends Figure {

    private final double sideLength;

    private final double area;

    public Square(String color, double sideLength) {
        super(color);
        this.sideLength = Math.ceil(sideLength * 10) / 10;
        this.area = calculateArea();
    }

    @Override
    public double calculateArea() {
        return Math.ceil((sideLength * sideLength) * 10) / 10;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: Square, area: " + area + " sq. units, sideLength: " + sideLength
                + ", color: " + getColor());
    }
}
