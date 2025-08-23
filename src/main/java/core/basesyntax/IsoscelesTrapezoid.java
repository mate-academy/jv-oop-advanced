package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    double sideA;
    double sideB;
    double height;

    public IsoscelesTrapezoid(String color, double sideA, double sideB, double height) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (sideA + sideB) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure name: " + name +
                ", Figure area: " + calculateArea() +
                ", Figure parameters: sideA=" + sideA + ", sideB=" + sideB + ", height=" + height +
                ", Figure color: " + color);
    }
}
