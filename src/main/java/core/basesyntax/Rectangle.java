package core.basesyntax;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle(Color color, double width, double height) {
        super ("Rectangle", color);
        this.width = width;
        this.height = height;
    }

    @Override
    protected double areaCalculation() {
        return width * height;
    }

    @Override
    public String draw() {
        return ("Figure: " + getName() + ", areа: " + areaCalculation() + " sq. units, width: " + width + " units, height: " + height +
                ", color: " + getColor());
    }
}
