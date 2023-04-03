package core.basesyntax;

public class Square implements Figure {
    private final double side;
    private final double diagonal;
    private final Color color;

    Square(double side, double diagonal, Color color) {
        this.color = color;
        this.side = side;
        this.diagonal = diagonal;
    }

    @Override
    public String getColor() {
        return color.name().toLowerCase();
    }

    @Override
    public double getArea() {
        double s;
        s = Math.sqrt(diagonal * diagonal) / 2;
        return s;
    }

    @Override
    public String display() {
        return "Figure: " + getName() + ", area: " + getArea() + " units, side: "
                + side + " units, color: " + getColor();
    }
}
