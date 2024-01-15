package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseA;
    private int baseB;
    private int height;

    public IsoscelesTrapezoid(String color, int baseA, int baseB, int height) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    public int getBaseA() {
        return baseA;
    }

    public int getBaseB() {
        return baseB;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public float getArea() {
        return (float) ((baseA + baseB) / 2) * height;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder();
        System.out.println(
                sb.append("Figure: isosceles trapezoid, area: ")
                        .append(getArea())
                        .append(" sq.units, smallBase: ")
                        .append(baseA)
                        .append(" units, bigBase: ")
                        .append(baseB)
                        .append("units, height: ")
                        .append(height)
                        .append(" units, color: ")
                        .append(getColor()));
    }
}
