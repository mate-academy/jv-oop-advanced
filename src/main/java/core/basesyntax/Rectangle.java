package core.basesyntax;

public class Rectangle extends FigureColor {
    private double width;
    private double height;

    public Rectangle(double width, double height, Color color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void drawable() {
        System.out.println("Figure: rectangle, area: " + areaCalculator()
                + " sq. units, width: " + width + " units, height: "
                + height + " units, color: " + getColor());
    }

    @Override
    public double areaCalculator() {
        return width * height;
    }
}
