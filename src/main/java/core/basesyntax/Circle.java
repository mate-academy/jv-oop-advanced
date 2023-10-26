package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getAreaFigure() {
        return radius * Math.PI;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void toInformation() {
        System.out.println("Figure: Circle, area: "
                + String.format("%.2f", getAreaFigure())
                + " sq. units, radius: "
                + String.format("%.0f", radius)
                + " units, color: "
                + getColor());
    }
}
