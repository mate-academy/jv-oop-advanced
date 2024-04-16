package core.basesyntax;

public class Square extends AbstractFigure {
    private final String color;
    private final double side;

    public Square(Color color, double side) {
        this.color = String.valueOf(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, side: " +
                side + " units, color: " + color);
    }

    @Override
    public Color getColor() {
        return Color.valueOf(color);
    }
}
