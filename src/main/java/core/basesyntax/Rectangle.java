package core.basesyntax;

public class Rectangle extends AbstractFigure {
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
    protected String getParametersString() {
        return "width: " + String.format("%.2f", width)
                + " units, height: " + String.format("%.2f", height) + " units";
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
