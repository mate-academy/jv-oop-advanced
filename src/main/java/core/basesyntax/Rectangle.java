package core.basesyntax;

public class Rectangle extends Figure {
    private final double width;
    private final double height;

    {
        setName("rectangle");
    }

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, "
                        + "area: %.1f sq.units, width: %.1f units, height: %.1f units, color: %s\n",
                getName(), getArea(), width, height, getColorString());
    }
}
