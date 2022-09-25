package core.basesyntax;

public class RightTriangle extends Figure {
    private static final String STR_PL = " sq.units, ";
    private static final String STR_UN = " unit, ";
    private static final String STR_CL = " color: ";
    private int firLeg;
    private int secLeg;

    public RightTriangle(String color, int firLeg, int secLeg) {
        super(color);
        this.firLeg = firLeg;
        this.secLeg = secLeg;
    }

    @Override
    public double getInfoFigure() {
        double area = 0.5 * firLeg * secLeg;
        String str1 = "Figure: triangle, area: ";
        String str2 = "firstLeg: ";
        String str3 = "secondLeg: ";
        String str4 = super.getColor();
        String sres = str1 + area + STR_PL + str2 + firLeg + STR_UN;
        System.out.println(sres + str3 + secLeg + STR_UN + STR_CL + str4);
        return area;
    }
}
