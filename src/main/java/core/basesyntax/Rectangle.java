package core.basesyntax;

public class Rectangle extends Figure {
    private int side;
    private int upAndDown;

    public Rectangle(String color, int side, int upAndDown) {
        super(color);
        this.side = side;
        this.upAndDown = upAndDown;
    }

    @Override
    public double area() {
        return side * upAndDown;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + area()
                + " sq. units, side: " + side + " units, up side and down side: " + upAndDown
                + " units, color: " + getColor());
    }
}
