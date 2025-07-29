package core.basesyntax;

public class Square extends Figure {

    private final double side;

    public Square(double side, String color) {
        this.side = side;
        this.setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square "
                + "area: " + getArea()
                + "side: " + side
                + "color: " + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
