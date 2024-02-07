package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(Color color, int sideA, int sideB) {
        setColor(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public void draw() {
        System.out.println(System.lineSeparator()
                + "Circle with area of " + calculateArea() + " sq. units"
                + System.lineSeparator()
                + " color: " + super.getColor()
                + System.lineSeparator()
                + "side a:" + sideA
                + System.lineSeparator()
                + "side b:" + sideB
                + System.lineSeparator());
    }
}
