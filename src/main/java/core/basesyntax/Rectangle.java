package core.basesyntax;

public class Rectangle extends AbstractFigure {
    private Color color;
    private double width;
    private double height;

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
        System.out.println(this.toString());
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Figure: rectangle, area: " + getArea()
                + " square units, width: " + width
                + " units, height: " + height
                + " units, color: " + color;
    }
}
