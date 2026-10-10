package core.basesyntax;

public class Rectangle extends Figure {
    private double side;
    private double width;

    public Rectangle(String color, double width, double side) {
        super(color);
        this.width = width;
        this.side = side;
    }

    @Override
    public double getArea() {
        return width * side;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: rectangle, area: " + getArea()
                + " sq. units, width: " + width
                + " units, side: " + side
                + " units, color: " + getColor()
        );
    }
}
