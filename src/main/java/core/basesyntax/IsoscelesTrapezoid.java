package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private double upperBase;
    private double lowerBase;
    private double height;

    public void setIsoscelesTrapezoid(double upperBase, double lowerBase, double height) {
        if (upperBase <= 0 || lowerBase <= 0 || height <= 0) {
            upperBase = 1;
            lowerBase = 3;
            height = 2;
        }
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public void setArea() {
        this.area = height * (upperBase + lowerBase)/2;
    }

    @Override
    public void getInfo() {
        System.out.println("Figure: isosceles trapezoid, area: " + area + " sq. units, bases: "
                + upperBase + " units and " + lowerBase + " units, height:" + height + " units, "
                + "color: " + getColor());
    }
}
