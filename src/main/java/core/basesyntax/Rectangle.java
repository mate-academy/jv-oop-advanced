package core.basesyntax;

public class Rectangle extends Figure {
    private final int height;
    private final int wight;

    public Rectangle(String color, int height, int wight) {
        super(color);
        this.height = height;
        this.wight = wight;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + calculateArea()
                + " sq.points, side1: "
                + height + " units, side2: " + wight
                + " units, color: " + getColor());
    }

    @Override
    public double calculateArea() {
        return height * wight;
    }
}
