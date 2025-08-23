package core.basesyntax;

public class Rectangle extends Figure {
    double sideA;
    double sideB;

    public Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println("Figure name: " + name +
                ", Figure area: " + calculateArea() +
                ", Figure parameters: sideA=" + sideA + ", sideB=" + sideB +
                ", Figure color: " + color);
    }
}
