package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int mediumLine;

    public IsoscelesTrapezoid(int height,int mediumLine,String color, String property) {
        super(color, property);
        this.height = height;
        this.mediumLine = mediumLine;
        calculateArea();
    }

    @Override
    public double calculateArea() {
        return (height * mediumLine);
    }

    @Override
    public String draw() {
        return "Figure{Isosceles Trapezoid , area: "
                + String.format("%.1f", calculateArea()) + " sq. units, "
                + getProperty() + ": " + mediumLine
                + " units, color: " + getColor()
                + '}';
    }
}
