package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return this.width * this.height;
    }

    @Override
    public String print() {
        return "Figure: rectangle, area: "
                + calculateArea()
                + " sq.units, width: "
                + this.width
                + " units, height: "
                + this.height
                + " units, color: "
                + this.getColor();
    }
}
