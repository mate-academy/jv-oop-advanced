package core.basesyntax;

public class Rectangle extends Figure {
    private static final String STR_PL = " sq.units, ";
    private static final String STR_UN = " unit, ";
    private static final String STR_CL = " color: ";
    private int firLeg;
    private int secLeg;

    public Rectangle(String color, int firLeg, int secLeg) {
        super(color);
        this.firLeg = firLeg;
        this.secLeg = secLeg;
    }

    @Override
    public double getArea() {
        return firLeg * secLeg;
    }

    @Override
    public double draw() {
        double area = getArea();
        String str1 = "Figure: restangle, area: ";
        String str2 = "width: ";
        String str3 = "height: ";
        String str4 = super.getColor();
        String sres = str1 + area + STR_PL + str2 + firLeg + STR_UN + str3;
        System.out.println(sres + secLeg + STR_UN + STR_CL + str4);
        return area;
    }
}
