package core.basesyntax;

public class IsoscelesTrapezoid implements Area, Draw {
    private double baseIsTrapezoid;
    private double upbaseIsTrapezoid;
    private double heihgtIsTrapezoid;
    private String color;

    public double getBaseIsTrapezoid() {
        return baseIsTrapezoid;
    }

    public double getUpbaseIsTrapezoid() {
        return upbaseIsTrapezoid;
    }

    public double getHeihgtIsTrapezoid() {
        return heihgtIsTrapezoid;
    }

    public void getIsoscelesTrapezoid(int baseIsTrapezoid, int upbaseIsTrapezoid,
                                      int heihgtIsTrapezoid, String color) {
        this.baseIsTrapezoid = baseIsTrapezoid;
        this.upbaseIsTrapezoid = upbaseIsTrapezoid;
        this.heihgtIsTrapezoid = heihgtIsTrapezoid;
        this.color = color;
        getArea();
    }

    @Override
    public double getArea() {
        return (baseIsTrapezoid + upbaseIsTrapezoid) / 2 * heihgtIsTrapezoid;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq.units, "
                + "baseIsTrapezoid: " + getBaseIsTrapezoid()
                + ", upbaseIsTrapezoid: " + getUpbaseIsTrapezoid()
                + ", heihgtIsTrapezoid: " + getHeihgtIsTrapezoid() + " units, color: " + color);
    }
}
