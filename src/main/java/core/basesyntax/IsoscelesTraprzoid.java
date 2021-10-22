package core.basesyntax;

public class IsoscelesTraprzoid extends Figure {
    private int baseA;
    private int baseB;
    private int height;

    public IsoscelesTraprzoid(String color, int baseA, int baseB, int height) {
        super(color);
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (baseA + baseB) * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + " sq.units, base A: " + baseA
                + " units, base B: " + baseB
                + " units, height: " + height
                + " units, color: " + getColor());
    }
}
