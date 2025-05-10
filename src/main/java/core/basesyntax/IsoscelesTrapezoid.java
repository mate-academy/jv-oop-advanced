package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double sideAB; //as CD too
    private double sideBC;
    private double sideAD;

    public IsoscelesTrapezoid(double newAB, double newBC, double newAD, String newColor) {
        if (newAB == newBC) {
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
        mathArea();
        mathLength();
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
    public double mathArea() {
        double math1 = getSideBC() + getSideAD();
        math1 /= 2;
        double math21;
        math21 = getSideAB() * getSideAB();
        double math22 = (getSideAD() - getSideBC()) * (getSideAD() - getSideBC());
        math22 /= 4;
        double math2 = math21 - math22;
        math2 = Math.sqrt(math2);
        double math = math1 * math2;
        setArea(math);
        return getArea();
    }

    @Override
    public double mathLength() {
        setBorderLength(sideAB + sideBC * 2 + sideAD);
        return getArea();
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getSymbol() + " - " + getName()
                + " (area: " + getArea() + " sq units;"
                + " border length (perimeter): " + getBorderLength() + " units;"
                + " sides length: " + getSideAB() + " units, " + getSideBC() + " units, "
                + " units, " + getSideCD() + " units, " + getSideAD() + " units;"
                + " color " + getColor() + ")");
    }
}
