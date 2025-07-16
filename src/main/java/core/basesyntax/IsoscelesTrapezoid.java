package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {

    private String color;
    private int smallBase;
    private int bigBase;
    private int height;

    public IsoscelesTrapezoid(String color, int smallBase, int bigBase, int height) {
        this.color = color;
        if (smallBase <= 0 || bigBase <= 0 || height <= 0) {
            System.out.println("Some of parameters is less than one");
            return;
        }
        this.smallBase = smallBase;
        this.bigBase = bigBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (double) (smallBase + bigBase) * height / 2;
    }

    @Override
    public String draw() {
        return "Figure: "
                + "isosceles trapezoid, "
                + "area: " + getArea() + " sq. units, "
                + "smallBase: " + smallBase + " units, "
                + "bigBase: " + bigBase + " units, "
                + "height: " + height + " units, "
                + "color: " + color;
    }
}
