package core.basesyntax;

public class Rectangle extends Figure {
    private int leftLeg;
    private int height;

    public Rectangle(String color, int leftLeg, int height) {
        super(color);
        this.leftLeg = leftLeg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (leftLeg * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea() + " sq.units, side: "
                + leftLeg + " height " + height + " units, color: " + color);
    }
}
