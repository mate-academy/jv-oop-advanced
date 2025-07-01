package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final double lowerBaseLength; // довжина нижньої основи має бути більше
    private final double upperBaseLength; // довжина верхньої основи має бути менша
    private final double heightLength;

    public IsoscelesTrapezoid(String color, double lowerBaseLength,
                              double upperBaseLength, double heightLength) {
        super(color);
        this.lowerBaseLength = lowerBaseLength;
        this.upperBaseLength = upperBaseLength;
        this.heightLength = heightLength;
    }

    @Override
    public double getArea() {
        return ((lowerBaseLength + upperBaseLength) / 2) * heightLength;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: "
                + getArea()
                + " sq. units, lowerBaseLength: "
                + lowerBaseLength
                + " units, upperBaseLength: "
                + upperBaseLength
                + " units, heightLength: "
                + heightLength + " units, color: "
                + getColor());
    }
}
