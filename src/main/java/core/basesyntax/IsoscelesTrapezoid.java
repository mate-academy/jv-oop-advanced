package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperBaseA;
    private int lowerBaseB;
    private int lateralSideC;
    private double hight;

    public IsoscelesTrapezoid(int upperBaseA, int lowerBaseB, int lateralSideC, String color) {
        this.upperBaseA = upperBaseA;
        this.lowerBaseB = lowerBaseB;
        this.lateralSideC = lateralSideC;
        super.setColor(color);
    }

    @Override
    public double countArea() {
        hight = Math.sqrt(Math.pow(lateralSideC, 2) - Math.pow(((lowerBaseB - upperBaseA) / 2), 2));
        return ((upperBaseA + lowerBaseB) * hight) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, " + "area: " + countArea()
                + " sq.units, " + "upper Base A: " + upperBaseA + " units,"
                + " lower Base B: " + lowerBaseB + " units,"
                + " lateral Side C: " + lateralSideC + " units,"
                + " color: " + getColor());
    }

    public int getUpperBaseA() {
        return upperBaseA;
    }

    public void setUpperBaseA(int upperBaseA) {
        this.upperBaseA = upperBaseA;
    }

    public int getLowerBaseB() {
        return lowerBaseB;
    }

    public void setLowerBaseB(int lowerBaseB) {
        this.lowerBaseB = lowerBaseB;
    }

    public int getLateralSideC() {
        return lateralSideC;
    }

    public void setLateralSideC(int lateralSideC) {
        this.lateralSideC = lateralSideC;
    }
}
