package core.basesyntax.figure;

public class IsoscelesTrapezoid extends Figure {
    private final double baseA;
    private final double baseB;
    private final double height;

    public IsoscelesTrapezoid(Color color, double baseA, double baseB, double height) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("IsoscelesTrapezoid{"
                + "area=" + calculateArea()
                + ", baseA=" + baseA
                + ", baseB=" + baseB
                + ", height=" + height
                + ", color=" + color
                + '}');
    }

    @Override
    public double calculateArea() {
        return (baseA + baseB) / 2 * height;
    }
}
