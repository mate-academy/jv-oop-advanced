package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public String getArea() {
        return String.valueOf(sideA * sideB);
    }
    @Override
    public String draw() {
        return "Figure: Rectangle, area:" + getArea() + "sq. units, sideA: " + sideA + " units, sideB: " + sideB + "units, color:" + super.draw();
    }
}
