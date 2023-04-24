package core.basesyntax;

public class Rectangle extends Figure {
    private final String name;
    private final double width;
    private final double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        name = "rectangle";
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: %s, area: %.3f sq.units, widht: %s "
                        + "units, height: %s units, color: %s",
                name, getArea(), width, height, color));
    }

}
