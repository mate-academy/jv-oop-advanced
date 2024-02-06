package core.basesyntax;

public class RightTriangle extends Figure {
    private final double height;
    private final double base;

    public RightTriangle(String color, double height, double base) {
        super(color);
        this.height = height;
        this.base = base;
    }

    @Override
    public String name() {
        return (Figures.RIGHTTRIANGLE).name();
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public void buildFigure() {
        System.out.println("Figure: " + name() + ", area: " + getArea() + " sq.units, height: "
                + height + ", base: " + base + " units, color: " + getColor());

    }
}
