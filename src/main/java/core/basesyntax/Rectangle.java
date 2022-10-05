package core.basesyntax;

public class Rectangle extends Figure {
    private final int lengthRectangle;
    private final int heightRectangle;

    public Rectangle(String color, int lengthRectangle, int heightRectangle) {
        super(color);
        this.lengthRectangle = lengthRectangle;
        this.heightRectangle = heightRectangle;
    }

    @Override
    public double getArea() {
        return lengthRectangle * heightRectangle;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea()
                + " sq.units, lengthRectangle: "
                + lengthRectangle + " units, heightRectangle: "
                + heightRectangle + " units, color: " + getColor());
    }
}
