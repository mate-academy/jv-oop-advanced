package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int baseA;
    private int baseB;
    private int height;

    IsoscelesTrapezoid(String color, int baseA, int baseB, int height) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (this.getBaseA() + this.getBaseB()) * this.getHeight() / 2.0;
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder().append(" Figure: isosceles trapezoid, area: ")
                .append(this.getArea()).append(" sq.units, baseA: ")
                .append(this.getBaseA()).append(" units,  baseB: ")
                .append(this.getBaseB()).append(" units, ")
                .append("height: ").append(this.getHeight()).append(" units, color: ")
                .append(this.getColor()).toString());
    }

    public int getHeight() {
        return this.height;
    }

    public int getBaseB() {
        return this.baseB;
    }

    public int getBaseA() {
        return this.baseA;
    }
}
