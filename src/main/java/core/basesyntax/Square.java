package core.basesyntax;

public class Square extends Figure {

    public Square() {
    }

    public Square(int getSide, Color color) {
    }

    @Override
    public double getArea() {
        return getSide() * getSide();
    }

    @Override
    public void draw() {
        System.out.print("Figure: " + new Square()
                + "area: " + new Square().getArea() + " sq.units"
                + "side: " + getSide() + "units"
                + "color: " + getColorSupplier().getRandomColor());
    }
}
