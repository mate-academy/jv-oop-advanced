package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double leg;
    private double baseA;
    private double baseB;
    private double height;

    public IsoscelesTrapezoid(Color color, double leg, double baseA, double baseB, double height) {
        super(color);
        if (leg <= 0 || baseA <= 0 || baseB <= 0 || height <= 0) {
            throw new IllegalArgumentException("All sides must be > 0");
        }
        setLeg(leg);
        setBaseA(baseA);
        setBaseB(baseB);
        setHeight(height);
    }

    public double getLeg() {
        return leg;
    }

    public void setLeg(double leg) {
        this.leg = leg;
    }

    public double getBaseA() {
        return baseA;
    }

    public void setBaseA(double baseA) {
        this.baseA = baseA;
    }

    public double getBaseB() {
        return baseB;
    }

    public void setBaseB(double baseB) {
        this.baseB = baseB;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (baseA + baseB) * height / 2;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder("Figure: isosceles trapezoid, ");
        builder.append("area: ").append(String.format("%.1f",getArea())).append(" sq. units, ");
        builder.append("leg: ").append(getLeg()).append(" units, ");
        builder.append("baseA: ").append(getBaseA()).append(" units, ");
        builder.append("baseB: ").append(getBaseB()).append(" units, ");
        builder.append("height: ").append(getHeight()).append(" units, ");
        builder.append("color: ").append(getColor().name());
        System.out.println(builder.toString());
    }
}
