package core.basesyntax;

public class IsoscelesTrapezoid implements Figure {
    private double baseIsTrapezoid;
    private double upbaseIsTrapezoid;
    private double heihgtIsTrapezoid;

    public IsoscelesTrapezoid(int baseIsTrapezoid, int upbaseIsTrapezoid, int heihgtIsTrapezoid) {
        this.baseIsTrapezoid = baseIsTrapezoid;
        this.upbaseIsTrapezoid = upbaseIsTrapezoid;
        this.heihgtIsTrapezoid = heihgtIsTrapezoid;
    }

    @Override
    public double getArea() {
        return (baseIsTrapezoid + upbaseIsTrapezoid) / 2 * heihgtIsTrapezoid;
    }
}
