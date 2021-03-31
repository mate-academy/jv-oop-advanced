package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square() {
        super("square");
        side = FigureSupplier.getRandomProperties();
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String draw() {
        return "Figure: " + getName()
                + ", area: " + getArea()
                + ", side: " + getSide()
                + ", color: " + getColor();
    }
}
