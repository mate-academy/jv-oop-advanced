package core.basesyntax;

public class Rectangle extends AbstractFigure {
    private final double height;
    private final double width;

    public Rectangle(Colors color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + calculateArea() + " sq. units, side 1: "
                + height + " units, " + "side 2 " + width + " units, color: " + color.name());
    }
}
