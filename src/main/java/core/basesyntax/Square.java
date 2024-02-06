package core.basesyntax;

public class Square extends Figure {
    private final double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public String name() {
        return String.valueOf(Figures.SQUARE);
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void buildFigure() {
        System.out.println("Figure: " + name() + ", area: " + getArea() + " sq.units, side: "
                + side + " units, color: " + getColor());

    }

}
