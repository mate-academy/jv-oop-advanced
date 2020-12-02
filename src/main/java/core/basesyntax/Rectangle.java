package core.basesyntax;

public class Rectangle extends Shape {
    private int sideOne;
    private int sideTwo;

    public Rectangle(int sideOne, int sideTwo, String color) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public double getArea() {
        return sideOne * sideTwo;
    }

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle, area = " + getArea()
                + " sq. units, side one = " + sideOne
                + " units, side two = " + sideTwo
                + " units, color = " + getColor());
    }
}
