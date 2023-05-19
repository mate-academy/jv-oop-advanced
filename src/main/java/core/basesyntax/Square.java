package core.basesyntax;

public class Square extends FigureAbstract implements Figure {
    private final int side;

    public Square(String color, int side) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (double) side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure:Square," +
                "area:" + getArea() +
                " sq.units,side:" + side + " units,color:" + color);
    }
}
