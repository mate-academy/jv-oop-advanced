package core.basesyntax;

public class RigthTriangle extends Figure implements State {
    private double leg1 = 0;
    private double leg2 = 0;
    private double hypotenuse = 0;
    private String color = BLUE;

    public RigthTriangle(double leg1, double leg2, double hypotenuse) {
        if (leg1 > 0 && leg2 > 0 && hypotenuse > 0) {
            if (hypotenuse * hypotenuse == leg1 * leg1 + leg2 * leg2) {
                this.leg1 = leg1;
                this.leg2 = leg2;
                this.hypotenuse = hypotenuse;
            } else {
                System.out.println("Pythagorean theorem is not met");
            }
        } else {
            System.out.println("Sides cannot be less than or equal 0");
        }
    }

    @Override
    public double countArea() {
        return (leg1 * leg2) / 2;
    }

    @Override
    public void drawFigure() {
        System.out.printf("Figure: triangle, area %f sq. units, %s, color %s\n",
                countArea(), uniqueProperty(), color);
    }

    public String uniqueProperty() {
        return String.format("hypotenuse: %f units", hypotenuse);
    }
}
