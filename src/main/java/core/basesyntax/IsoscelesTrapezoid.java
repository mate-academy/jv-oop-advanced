package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseSideA;
    private int baseSideB;
    private int height;

    public IsoscelesTrapezoid(String color, int baseSideA, int baseSideB, int height) {
        super(color);
        this.baseSideA = baseSideA;
        this.baseSideB = baseSideB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * (baseSideA + baseSideB) / 2;
    }

    @Override
    public void draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(getClass().getSimpleName())
                .append(", area: ").append(getArea()).append(" sq.units, baseSide a: ")
                .append(baseSideA).append(" units,  baseSide b: ")
                .append(baseSideB).append(" units, height: ")
                .append(height).append(" units, color: ").append(getColor()).toString();
        System.out.println(sb);
    }
}
