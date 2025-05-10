package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double topBase;
    private double bottomBase;
    private double height;

    public IsoscelesTrapezoid(Color color, double base, double base1, double height) {
        super(color);
        this.bottomBase = bottomBase;
        this.topBase = topBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((topBase + bottomBase) / 2) * height;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Isoscleles Trapezoid color is ").append(getColor())
                .append(", area: ").append(getArea()).append(". Bottom Base: ").append(bottomBase)
                .append(". Top Base: ").append(topBase).append(". Height: ").append(height);
        System.out.println(stringBuilder);
    }
}
