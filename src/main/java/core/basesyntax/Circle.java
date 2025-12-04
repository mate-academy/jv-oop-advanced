package core.basesyntax;

public class Circle extends AbstractFigure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    protected String getParametersString() {
        return "radius: " + radius;
    }

    @Override
    public void draw() {
        String name = this.getClass().getSimpleName().toLowerCase();
        String areaStr = String.format("%.2f", getArea()) + " sq. units";
        String params = getParametersString();
        System.out.println("Figure: " + name + ", area: "
                + areaStr + ", " + params + ", color: " + getColor());

    }
}
