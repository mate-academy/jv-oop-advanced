package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2;
    private double height;

    public IsoscelesTrapezoid(String color, double base1, double base2, double height) {
        super(color);
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public double getS() {
        return ((this.base1 + this.base2) / 2) * this.height;
    }

    @Override
    public void drawFigure() {
        System.out.println("Isosceles Trapezoid { base 1 = " + this.base1
                            + ", base 2 = " + this.base2
                            + ", height = " + this.height + ", square = " + getS()
                            + ", color - " + getColor() + " }");
    }
}
