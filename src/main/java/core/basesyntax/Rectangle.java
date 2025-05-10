package core.basesyntax;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void drawShape() {
        System.out.println(String.format("%s%.1f%s%.1f%s%.1f%s%s",
                "Figure: rectangle, area: ", this.calculateArea(), " sq. units, length: ",
                this.getLength(), " units, width: ",
                this.getWidth(), " units, color: ", this.getColor()));
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}
