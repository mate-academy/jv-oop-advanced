package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, Color color) {
        this.side = side;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Square:\n"
                + " side: " + side
                + " color: " + getColor()
                + " area: " + getArea());
    }
}
