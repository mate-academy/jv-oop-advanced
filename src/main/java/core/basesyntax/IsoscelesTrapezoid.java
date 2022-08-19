package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topLine;
    private int bottomLine;
    private int height;

    public IsoscelesTrapezoid(String color, int topLine, int bottomLine, int height) {
        super(color);
        this.topLine = topLine;
        this.bottomLine = bottomLine;
        this.height = height;
    }

    @Override
    public double obtainArea() {
        return ((topLine + bottomLine) * height) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure, isosceles trapezoid, area: " + obtainArea()
                + " sq.units, topLine: " + topLine
                + " units, bottomLine: " + bottomLine
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}
