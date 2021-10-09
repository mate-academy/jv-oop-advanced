package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(int width, int height, String color) {
        this.width = width;
        this.height = height;
        super.setType("Rectangle");
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %s sq.units, width: %s units, "
                        + "height: %s units, color: %s%n",
                getType(), getArea(), width, height, getColor());
    }
}
