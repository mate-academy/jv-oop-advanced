package core.basesyntax;

public class IsoscelesTrapezoid implements Figure{
    private double sideT;
    private double sideY;
    private double height1;
    private String color;

    public IsoscelesTrapezoid(double sideT, double sideY, double height1, String color) {
        this.sideT = sideT;
        this.sideY = sideY;
        this.height1 = height1;
        this.color = color;
    }


    @Override
    public double getArea() {
        return (sideT + sideY) / 2 * height1;
    }

    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, sideT: " + sideT + " sq.units, sidey: " + sideY + " height1 " + height1 + " units, color: " + color);
    }

    @Override
    public String getColor() {
        return color;
    }
}
