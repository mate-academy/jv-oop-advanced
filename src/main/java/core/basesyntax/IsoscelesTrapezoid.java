package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private final FigureColor color;
    private final double topLength;
    private final double bottomLength;
    private final double height;

    public IsoscelesTrapezoid(FigureColor color, double topLength, double bottomLength, double height) {
        this.color = color;
        this.topLength = topLength;
        this.bottomLength = bottomLength;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (topLength * bottomLength) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Isosceles Trapezoid: top length = "
                + topLength
                + ", bottom length = "
                + bottomLength
                + ", height = "
                + height
                + ", color = "
                + color
                + ", area = "
                + getArea() + " sq.units.");
    }
}
