package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square() {
    }

    public Square(int getSide, Color color) {
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.print("Figure: " + new Square()
                + "area: " + new Square().getArea() + " sq.units"
                + "side: " + side + "units"
                + "color: " + getColorSupplier().getRandomColor());
    }
}
