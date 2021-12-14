package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double baseIsTrapezoid;
    private double upbaseIsTrapezoid;
    private double heihgtIsTrapezoid;

    public IsoscelesTrapezoid(int baseIsTrapezoid, int upbaseIsTrapezoid,
                                      int heihgtIsTrapezoid, String color) {
        this.baseIsTrapezoid = baseIsTrapezoid;
        this.upbaseIsTrapezoid = upbaseIsTrapezoid;
        this.heihgtIsTrapezoid = heihgtIsTrapezoid;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (baseIsTrapezoid + upbaseIsTrapezoid) / 2 * heihgtIsTrapezoid;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName() + ", area: "
                + getArea() + " sq.units, "
                + "baseIsTrapezoid: " + baseIsTrapezoid
                + ", upbaseIsTrapezoid: " + upbaseIsTrapezoid
                + ", heihgtIsTrapezoid: " + heihgtIsTrapezoid + " units, color: " + color);
    }
}
