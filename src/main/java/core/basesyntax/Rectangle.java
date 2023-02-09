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
        System.out.println("\nRectangle with area of " + calculateArea() + " sq. units");
        super.draw();
        System.out.println("sideA:" + sideA + "\nsideB:" + sideB + "\n");
    }
}
