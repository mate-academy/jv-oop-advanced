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
                + "Rectangle with area of " + calculateArea() + " sq. units");
        super.draw();
        System.out.println(System.lineSeparator() + "sideA:" + sideA
                + System.lineSeparator() + "sideB:" + sideB
                + System.lineSeparator());
    }
}
