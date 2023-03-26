package core.basesyntax;

public class Rectangle extends Figure {

    public Rectangle(){}

    public Rectangle(int getHeight, int getWidth, Color color) {
    }

    @Override
    public double getArea() {
        return getHeight() * getWidth();
    }

    @Override
    public void draw() {
        System.out.print("Figure: " + new Rectangle()
                + "area: " + new Rectangle().getArea() + " sq.units"
                + "side: " + getWidth() + "units"
                + "color: " + colorSupplier.getRandomColor());
    }
}
