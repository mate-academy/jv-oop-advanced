package core.basesyntax;

public class RightTriangle extends Figure {
    private double sideAB;
    private double sideBC;
    private double sideAC; //hypotenuse

    public RightTriangle(double newAB, double newBC, double newAC, String newColor) {
        setName("right triangle");
        setSymbol("◢");
        sideAB = newAB;
        sideBC = newBC;
        if (String.format("%.3f",(newAC * newAC))
                        .equals(String.format("%.3f",(newAB * newAB + newBC * newBC))
                        ) == false) {
            double autoAC = Math.sqrt(newAB * newAB + newBC * newBC);
            sideAC = autoAC;
            System.out.println("Your hypotenuse is wrong and changed to new!\n"
                        + "Hypotenuse: " + newAC + " => " + autoAC);
        } else {
            sideAC = newAC;
        }
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

    public double getSideAC() {
        return sideAC;
    }

    @Override
    public void calculateArea() {
        double math1 = getSideAB() + getSideBC() + getSideAC();
        math1 /= 2;
        double math = (math1 - sideAB) * (math1 - sideBC);
        setArea(math);
        getArea();
    }

    @Override
    public void calculateBorderline() {
        setBorderline(sideAB + sideBC + sideAC);
        getBorderline();
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: " + getSymbol() + " - " + getName()
                + " (area: " + getArea() + " sq units;"
                + " borderline (perimeter): " + getBorderline() + " units;"
                + " sides length: " + getSideAB() + " units, " + getSideBC() + " units, "
                + getSideAC() + " units;"
                + " color " + getColor() + ")");
    }
}
