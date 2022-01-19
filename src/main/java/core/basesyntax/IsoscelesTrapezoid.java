package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int mediumLine;

    public IsoscelesTrapezoid(int height, int mediumLine, String color) {
        super(color);
        this.height = height;
        this.mediumLine = mediumLine;
    }

    @Override
    public double calculateArea() {
        return (height * mediumLine);
    }

    @Override
    public String draw() {
        return "Figure{Isosceles Trapezoid , area: "
                + String.format("%.1f", calculateArea()) + " sq. units, "
                + "medium line: " + mediumLine
                + " units, color: " + getColor()
                + '}';
    }
}
