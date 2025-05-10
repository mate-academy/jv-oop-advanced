package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double heigth;

    public Rectangle(double width, double heigth, String color) {
        super(color);
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public double getArea() {
        return width * heigth;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, width: " + width
                + " units, heigth: " + heigth + " units, color: " + getColor());
    }
}
