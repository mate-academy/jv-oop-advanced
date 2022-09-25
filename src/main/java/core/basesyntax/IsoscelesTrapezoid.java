package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final String STR_PL = " sq.units, ";
    private static final String STR_UN = " unit, ";
    private static final String STR_CL = " color: ";
    private int firLeg;
    private int secLeg;
    private int height;

    public IsoscelesTrapezoid(String color, int firLeg, int secLeg, int height) {
        super(color);
        this.firLeg = firLeg;
        this.secLeg = secLeg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * (firLeg + secLeg) * height;
    }

    @Override
    public double draw() {
        double area = getArea();
        String str1 = "Figure: trapezoid, area: ";
        String str2 = "firstBase: ";
        String str3 = "secondBase: ";
        String str4 = "height: ";
        String str5 = super.getColor();
        System.out.println(str1 + area + STR_PL + str2 + firLeg + STR_UN + str3 + secLeg + STR_UN
                + str4 + height + STR_UN + STR_CL + str5);
        return area;
    }
}
