package core.basesyntax;

public class Rectangle extends Figure {
    private final double height;
    private final double width;

    public Rectangle(double height,double width, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double calculateArea() {
        double area = getHeight() * getHeight();
        return Math.floor(area * Math.PI * 100) / 100.0;
    }

    public void display() {
        System.out.println("Figure: rectangle," + " area: "
                + calculateArea() + " sq.units," + " height: " + getHeight()
                + " units, " + "width: " + getWidth() + " units," + " color: " + getColor());
    }
}
