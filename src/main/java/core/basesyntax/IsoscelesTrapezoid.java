package core.basesyntax;
public class IsoscelesTrapezoid extends Figure implements Drawable,Area {
    private int baseUp;
    private int baseDown;
    private int leg;
    private double height;
    public IsoscelesTrapezoid(String color, int baseDown, int baseUp, int leg) {
        setColor(color);
        this.baseDown = baseDown;
        this.baseUp = baseUp;
        this.leg = leg;
        this.height = Math.sqrt(Math.pow(leg, 2) - Math.pow((baseDown - baseUp) / 2.0, 2));
    }
    public int getBaseUp() {
        return baseUp;
    }
    public void setBaseUp(int baseUp) {
        this.baseUp = baseUp;
    }
    public int getBaseDown() {
        return baseDown;
    }
    public void setBaseDown(int baseDown) {
        this.baseDown = baseDown;
    }
    public int getLeg() {
        return leg;
    }
    public void setLeg(int leg) {
        this.leg = leg;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    @Override
    public double getArea() {
        return (((baseUp + baseDown) / 2.0) * height);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + "isosceles trapezoid, " + "area: " + getArea()
                + " sq. units, " + "baseDown: " + baseDown + " units, " + "baseUp: "
                + baseUp + " units, " + "leg: " + leg + " units, "
                + "height: " + height + " units, " + "color: " + getColor());
    }
}