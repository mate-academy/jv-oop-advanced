package core.basesyntax;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle(int height, int width, Color color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle, area: " + getArea() + " sq.units, height length: "
                + getHeight() + " units, color: " + getColor());
    }

    @Override
    public double getArea() {
        return this.height * this.width;
    }
}
