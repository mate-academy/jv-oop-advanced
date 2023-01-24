package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements Area {
    private double baseA;
    private double baseB;
    private double height;

    public IsoscelesTrapezoid(double baseA, double baseB, double height) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }


    @Override
    public double getArea() {
        return ((baseA + baseB) / 2) * height;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder("Figure: ");
        builder.append("IsoscelesTrapezoid, area: ").append(getArea()).append(" sq.units, ").append("baseA: ").append(baseA).append(" baseB: ").append(baseB).append(" height: ").append(height).append(" color: ").append(getColor());
        System.out.println(builder.toString());
    }
}
