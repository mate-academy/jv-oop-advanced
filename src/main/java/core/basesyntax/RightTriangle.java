package core.basesyntax;

public class RightTriangle extends Figure {
    private final int base;
    private final int height;

    public RightTriangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public String getName() {
        return Figures.RIGHTTRIANGLE.name().toLowerCase();
    }

    @Override
    public double area() {
        return base * height * 0.5;
    }

    @Override
    public void infoAboutFigure() {
        System.out.println("Figure: " + getName() + ", area " + area() + " sq.units, base: "
                + base + ", height: " + height + ", color: " + getColor());
    }
}
