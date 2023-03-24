package core.basesyntax;

public class Square extends Figure {

    private ColorSupplier colorSupplier = new ColorSupplier();

    public Square() {
    }

    @Override
    public double getArea() {
        return this.getHeight() * getHeight();
    }

    @Override
    public void draw() {
        System.out.print("Figure: " + new Square()
                + "area: " + new Square().getArea() + " sq.units"
                + "side: " + getHeight() + "units"
                + "color: " + colorSupplier.getRandomColor());
    }
}
