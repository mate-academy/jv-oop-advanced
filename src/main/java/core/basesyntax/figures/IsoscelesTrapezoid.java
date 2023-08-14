package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private int lowBase;
    private int highBase;
    private int leg;
    private int height;

    public IsoscelesTrapezoid(String color, int lowBase, int highBase, int leg, int height) {
        super(color);
        this.lowBase = lowBase;
        this.highBase = highBase;
        this.leg = leg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (lowBase + highBase) / 2 * height;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: isosceles trapezoid, area: ").append(getArea())
                .append(", lowBase: ").append(lowBase)
                .append(", highBase: ").append(highBase)
                .append(", leg: ").append(leg)
                .append(", height: ").append(height)
                .append(", color:").append(getColor())
                .append('\n');
        System.out.println(stringBuilder.toString());
    }
}
