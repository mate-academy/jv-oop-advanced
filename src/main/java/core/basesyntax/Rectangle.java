package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(Color color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName() + ", area: " + calculate()
                + " sq. units, width: " + width + " units, height: "
                + height + " units, color: " + color.name().toLowerCase());
    }

    @Override
    public double calculate() {
        return width * height;
    }
}
