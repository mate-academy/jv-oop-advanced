package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius,String id, String color) {
        super(id, color);
        this.radius = radius;
    }

    @Override
    public void drawerFigure() {
        System.out.println("Figure:" + getId()
                + ", Area " + getAreaCalculate()
                + " sq, "
                + "Radius: " + radius
                + ", color " + getColor());

    }

    @Override
    public double getAreaCalculate() {
        return Math.PI * radius * radius;
    }
}
