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
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + this.calculateArea()
                + "sq. units, base a: "
                + this.baseA
                + " units, base b: "
                + this.baseB
                + " units, height: "
                + this.height
                + " units, color: "
                + this.color);
    }

    @Override
    public double calculateArea() {
        return ((this.baseA + this.baseB) * this.height) / 2.0;
    }
}
