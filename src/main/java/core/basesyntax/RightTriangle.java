package core.basesyntax;

public class RightTriangle extends Figure {
    private double base;
    private double height;
    private final static double FORMULA_HELPER = 0.5;

    RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double area() {
        return FORMULA_HELPER*base*height;
    }
    @Override
    public String getSpecificProperties() {
        return "base: " + base + " height: " + height;
    }


}
