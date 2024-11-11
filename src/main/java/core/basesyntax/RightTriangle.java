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
        System.out.println("Прямокутний трикутник { катет1 = " + this.leg1 + ", катет2 = "
                            + this.leg2 + ", гіпотенуза = " + this.hypotenusa
                            + ", площа = " + getS()
                            + ", колір - " + getColor() + " }");
    }
}
