package core.basesyntax;

public class Rectangle extends Figure {
    private int sideOne;
    private int sideTwo;

    public Rectangle(int sideOne, int sideTwo, String color) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle, area = " + findArea()
                + " sq. units, side one = " + sideOne
                + " units, side two = " + sideTwo
                + " units, color = " + getColor());
    }

    @Override
    public double findArea() {
        return sideOne * sideTwo;
    }
}
