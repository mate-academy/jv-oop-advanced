package core.basesyntax;

public class Circle extends Figure {
    private static final String STR_PL = " sq.units, ";
    private static final String STR_UN = " unit, ";
    private static final String STR_CL = " color: ";
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double draw() {
        double area = getArea();
        String str1 = "Figure: circle, area: ";
        String str2 = "side: ";
        String str3 = super.getColor();
        System.out.println(str1 + area + STR_PL + str2 + radius + STR_UN + STR_CL + str3);
        return area;
    }
}
