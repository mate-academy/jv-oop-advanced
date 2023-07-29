package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseA;
    private int baseB;
    private int height;

    public IsoscelesTrapezoid(Color color, int baseA, int baseB, int height) {
        super(color);
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
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: isosceles trapezoid, ")
                .append("area: ")
                .append(getArea())
                .append(" sq.units, ")
                .append("base A: ")
                .append(baseA)
                .append(" units, ")
                .append("base B: ")
                .append(baseB)
                .append(" units, ")
                .append("height: ")
                .append(height)
                .append(" units, ")
                .append("color: ")
                .append(getColor().name().toLowerCase());
        String stringToPrint = stringBuilder.toString();

        System.out.println(stringToPrint);
    }
}
