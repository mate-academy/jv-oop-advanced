package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, Color color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.round(side * side * 100.0) / 100.0;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: square, area: " + getArea() + ", side: " + side + ", color: " + color
        );
    }
}
