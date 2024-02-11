package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getPrint() {
        return "Figure: circle, area: " + getArea() + "sq. units, "
                + " radius " + radius + " units, " + "color: " + getColor();
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
