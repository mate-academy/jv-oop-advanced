package core.basesyntax;

public class Rectangle extends Figure {
    private final int wight;
    private final int height;

    public Rectangle(Color color, int wight, int height) {
        super(color);
        this.wight = wight;
        this.height = height;
    }

    @Override
    public double getArea() {
        return wight * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, Color: " + getColor()
                + ", Wight: " + wight + ", Height: " + height + ", Area: " + getArea());
    }
}
