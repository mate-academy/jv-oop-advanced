package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideAB; //as CD too
    private double sideBC;
    private double sideAD;

    public IsoscelesTrapezoid(double newAB, double newBC, double newAD, String newColor) {
        if (newAB == newBC && newBC == newAD) {
            setName("square");
            setSymbol("■");
        } else if (newAB == newAD) {
            setName("rectangle");
            setSymbol("▬");
        } else {
            setName("isosceles trapezoid");
            setSymbol("▰");
        }

        sideAB = newAB;
        sideBC = newBC;
        sideAD = newAD;
        super.setColor(newColor);
        calculateArea();
        calculateBorderline();
    }

    public double getSideAB() {
        return sideAB;
    }

    public double getSideBC() {
        return sideBC;
    }

    public double getSideCD() {
        //as a AB
        return sideAB;
    }

    public double getSideAD() {
        return sideAD;
    }

    @Override
    public void calculateArea() {
        double math1 = (2 * getSideAB() + getSideBC() + getSideAD()) / 2;
        double math2 = (math1 - getSideAB()) * (math1 - getSideAB())
                        * (math1 - getSideBC()) * (math1 - getSideAD());
        double math = Math.sqrt(math2);
        setArea(math);
        getBorderline();
    }

    @Override
    public void calculateBorderline() {
        setBorderline(sideAB + sideBC * 2 + sideAD);
        getBorderline();
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getSymbol() + " - " + getName()
                + " (area: " + getArea() + " sq units;"
                + " borderline (perimeter): " + getBorderline() + " units;"
                + " sides length: " + getSideAB() + " units, " + getSideBC()
                + " units, " + getSideCD() + " units, " + getSideAD() + " units;"
                + " color " + getColor() + ")");
    }
}
