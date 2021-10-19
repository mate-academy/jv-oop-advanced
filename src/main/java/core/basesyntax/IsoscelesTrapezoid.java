package core.basesyntax;

public class IsoscelesTrapezoid {
    private double baseIsTrapezoid;
    private double upbaseIsTrapezoid;
    private double heihgtIsTrapezoid;

    public IsoscelesTrapezoid(int baseIsTrapezoid, int upbaseIsTrapezoid, int heihgtIsTrapezoid,
                              String color) {
        double area = (baseIsTrapezoid + upbaseIsTrapezoid) / 2 * heihgtIsTrapezoid;
        Draw draw = new Draw();
        draw.draw("isosceles trapezoid", area, "baseIsTrapezoid: " + baseIsTrapezoid
                + ", upbaseIsTrapezoid: " + upbaseIsTrapezoid
                + ", heihgtIsTrapezoid: " + heihgtIsTrapezoid, color);
    }
}
