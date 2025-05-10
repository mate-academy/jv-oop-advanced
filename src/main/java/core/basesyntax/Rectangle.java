package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int heigth;

    public Rectangle(int width, int heigth, String color) {
        super(color);
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public double getArea() {
        return width / 2 * heigth;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: " + getArea()
                + " sq.units, side: " + width + " units," + " side: " + heigth + " units,"
                + " color: " + color);
    }
}
