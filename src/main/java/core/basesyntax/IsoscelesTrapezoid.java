package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int topBase;
    private int bottomBase;
    private int height;

    public IsoscelesTrapezoid(int topBase, int bottomBase, int height) {
        this.topBase = topBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    @Override
    public String getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: isosceles trapezoid, area: ");
        stringBuilder.append(getArea());
        stringBuilder.append(" units, top: ");
        stringBuilder.append(topBase);
        stringBuilder.append(" units, bottom: ");
        stringBuilder.append(bottomBase);
        stringBuilder.append(" units, height: ");
        stringBuilder.append(height);
        stringBuilder.append(" units, color: ");
        stringBuilder.append(getColor());
        return stringBuilder.toString();
    }

    @Override
    public double getArea() {
        return ((topBase + bottomBase) / 2) * height;
    }
}
