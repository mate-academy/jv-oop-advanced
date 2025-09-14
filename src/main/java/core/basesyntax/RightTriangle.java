package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        if (firstLeg <= 0 || secondLeg <= 0) {
            throw new IllegalArgumentException("Legs must be > 0");
        }
        setFirstLeg(firstLeg);
        setSecondLeg(secondLeg);
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder("Figure: right triangle, ");
        builder.append("area: ").append(String.format("%.1f",getArea())).append(" sq. units, ");
        builder.append("first leg: ").append(getFirstLeg()).append(" units, ");
        builder.append("second leg: ").append(getSecondLeg()).append(" units, ");
        builder.append("color: ").append(getColor().name());
        System.out.println(builder.toString());
    }
}
