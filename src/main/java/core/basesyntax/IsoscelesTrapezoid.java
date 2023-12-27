package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int topLine;
    private final int bottomLine;
    private final int height;

    public IsoscelesTrapezoid(int topLine, int bottomLine, int height, String color) {
        super(color);
        this.topLine = topLine;
        this.bottomLine = bottomLine;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + String.format("%.2f", getArea()) + " sq. units, top line: "
                + topLine + " units, bottom line: "
                + bottomLine + " units, height: "
                + height + " units, color: " + super.getColor());
    }

    @Override
    public double getArea() {
        return (double) ((topLine + bottomLine)) * height / 2;
    }
}
