package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double base1;
    private double base2; // bigger base
    private double height;
    private double leg;

    /*
                    base1
            -------------------             |
           /                    \           |
          /                      \ leg      | height
         /________________________\         |
                  base2
        Constructor initialise Isosceles Trapezoid object.
        Formal parameters base1 and base2 may be passed in arbitrary order.
        After initialisation base2 always will be bigger then base1
     */
    IsoscelesTrapezoid(double base1, double base2, double height, Colors color) {
        super("Isosceles Trapezoid", color);
        this.base1 = base1 < base1 ? base1 : base2;
        this.base2 = base2 > base1 ? base2 : base1;
        this.height = height;
        leg = Math.sqrt(height * height + Math.pow((base2 - base1) / 2, 2));
    }

    @Override
    public double getArea() {
        return height * (base1 + base2) / 2;
    }

    @Override
    public String toString() {
        return getFigureInfo()
            + String.format(", base1: %.1f units, base2: %.1f units,"
                + " height: %.1f units, leg: %.1f units", base1, base2, height, leg);
    }

}
