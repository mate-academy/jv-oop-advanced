package core.basesyntax;

public class Rectangle extends BaseFigure {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
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
        System.out.printf("Figure: rectangle, area: %.2f sq. units, width: %.2f units, height: %.2f units, color: %s%n",
                getArea(), width, height, color);
    }
}

