package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;
    private final static double FORMULA_HELPER = 2.0;
    IsoscelesTrapezoid(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }
    public void setBase1(double base1) {
        this.base1 = base1;
    }
    public void setBase2(double base2) {
        this.base2 = base2;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double area() {

        return (base1 + base2) * height / FORMULA_HELPER;
    }
    @Override
    public String getSpecificProperties() {
        return "base1: " + base1 + " base2: " + base2 + " height: " + height;
    }

}
