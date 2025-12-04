package core.basesyntax;

public class Square extends AbstractFigure {
    private double side;

    public Square(double side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    protected String getParametersString() {
        return "side: " + String.format("%.2f", side) + " units";
    }
    @Override
    public void draw() {
        String name = this.getClass().getSimpleName().toLowerCase();
        String areaStr = String.format("%.2f", getArea()) + " sq. units";
        String params = getParametersString();
        System.out.println("Figure: " + name + ", area: " + areaStr + ", " + params + ", color: " + getColor());

    }
}
