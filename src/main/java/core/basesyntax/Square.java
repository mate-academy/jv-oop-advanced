package core.basesyntax;

public class Square extends Figure implements Drawable {
    private double side;
    private Color color;

    public Square(double side, Color color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + ", side: " + side + ", color: " + color.name());
    }
}
