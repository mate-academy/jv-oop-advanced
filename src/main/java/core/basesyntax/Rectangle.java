package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return Math.round(width * height);
    }

    @Override
    public String toString() {
        return "Figure: "
                + this.getClass().getSimpleName().toLowerCase() + ", "
                + "area: " + this.calculateArea() + " sq. units, "
                + "width: " + this.width + ", "
                + "height: " + this.height + ", "
                + "color: " + getColor().toString()
                + '}';
    }
}
