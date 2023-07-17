package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double baseA;
    private final double baseB;

    public IsoscelesTrapezoid(String color, double baseA, double baseB) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder("Figure: IsoscelesTrapezoid, color: ");

        String text = stringBuilder
                .append(super.getColor()).append(", baseA: ")
                .append(baseA)
                .append(", baseB: ")
                .append(baseB)
                .append(", area: ")
                .append(getArea())
                .toString();
        System.out.println(text);
    }

    @Override
    public double getArea() {
        double h = baseA / 2;
        return ((baseA + baseB) / 2) * h;
    }
}
