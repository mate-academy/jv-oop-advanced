package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBase;
    private double secondBase;
    private double height;

    public IsoscelesTrapezoid(double firstBase, double secondBase, double height, String color) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: trapezoid, ")
                .append("area: ").append(getArea()).append(" sq.units, ")
                .append("firstBase: ").append(firstBase).append(" units, ")
                .append("secondBase: ").append(secondBase).append(" units, ")
                .append("height: ").append(height).append(" units, ")
                .append("color: ").append(getColor().toLowerCase());
        System.out.println(stringBuilder);
    }

    @Override
    public double getArea() {
        return ((firstBase + secondBase) * height) / 2;
    }
}
