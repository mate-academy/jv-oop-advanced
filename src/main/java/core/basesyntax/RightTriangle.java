package core.basesyntax;

public class RightTriangle extends Figure {
    private double leg1;
    private double leg2;
    private double hypotenusa;

    public RightTriangle(String color, double leg1, double leg2, double hypotenusa) {
        super(color);
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.hypotenusa = hypotenusa;
    }

    public double getS() {
        return (this.leg1 * this.leg2) / 2;
    }

    @Override
    public void drawFigure() {
        System.out.println("Right Triangle { leg 1 = " + this.leg1 + ", leg 2 = "
                            + this.leg2 + ", hypotenusa = " + this.hypotenusa
                            + ", square = " + getS()
                            + ", color - " + getColor() + " }");
    }
}
