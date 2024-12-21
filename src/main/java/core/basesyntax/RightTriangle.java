package core.basesyntax;

public class RightTriangle extends AbstractFigure {
    private String color;
    private double base;
    private double heigth;

    public RightTriangle(String color,double base, double heigth) {
        super(color);
        this.base = base;
        this.heigth = heigth;
    }

    public double getArea() {
        return 0.5 * base * heigth;
    }

    @Override
    public String describe() {
        return "RightTriange " + getColor() + " base: " + base + " heigth: "
                + heigth + " area: " + getArea();
    }
}
