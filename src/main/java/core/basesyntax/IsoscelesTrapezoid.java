package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double height;
    private double upLine;
    private double downLine;

    IsoscelesTrapezoid(String color) {
        super(color);
    }

    IsoscelesTrapezoid(String color, double height, double upLine, double downLine) {
        super(color);
        this.setName("IsoscelesTrapezoid");
        this.height = height;
        this.downLine = downLine;
        this.upLine = upLine;
        this.setArea(calculateArea());
    }

    @Override
    void drawFigure() {
        String text = "Figure: " + getName() + ", area: " + getArea()
                + " sq.units, base lines: " + getUpLine()
                + " units and " + getDownLine() + " units, height: "
                + getHeight() + " units, color: " + getColor();
        System.out.println(text);
    }

    public double getDownLine() {
        return downLine;
    }

    public void setDownLine(double downLine) {
        this.downLine = downLine;
    }

    public double getUpLine() {
        return upLine;
    }

    public void setUpLine(double upLine) {
        this.upLine = upLine;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (upLine + downLine) / 2 * height;
    }
}
