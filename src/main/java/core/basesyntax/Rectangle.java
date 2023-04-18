package core.basesyntax;

public class Rectangle extends Figure {
    private int widht;
    private int height;

    public Rectangle(int widht, int height) {
        this.widht = widht;
        this.height = height;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: rectangle, area: "
                + getArea()
                + "  sq.units, widht: "
                + widht + " units, height: "
                + height + " units, color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return widht * height;
    }
}
