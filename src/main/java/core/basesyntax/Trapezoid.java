package core.basesyntax;

public class Trapezoid extends Figure {

    private final double baseA;
    private final double baseB;
    private final double height;

    public Trapezoid(double baseA, double baseB, double height, Color color) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
        this.color = color;
        this.area = ((baseA + baseB) / 2) * height;
    }

    public void draw() {
        System.out.println(new StringBuilder("Trapezoid: area: ")
                .append(area)
                .append(", color: ")
                .append(color)
                .append(", height: ")
                .append(height));
    }
}

