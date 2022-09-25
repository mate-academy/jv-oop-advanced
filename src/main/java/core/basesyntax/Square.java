package core.basesyntax;

public class Square extends Figure {
    private static final String STR_PL = " sq.units, ";
    private static final String STR_UN = " unit, ";
    private static final String STR_CL = " color: ";
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getInfoFigure() {
        double area = side * side;
        String str1 = "Figure: square, area: ";
        String str2 = "side: ";
        String str3 = super.getColor();
        System.out.println(str1 + area + STR_PL + str2 + side + STR_UN + STR_CL + str3);
        return area;
    }
}
