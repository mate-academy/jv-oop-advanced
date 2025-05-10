package core.basesyntax;

public class Rectangle extends Figure {
    private int sideOne;
    private int sideTwo;

    public Rectangle(String color, int sideOne, int sideTwo) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName()
                + ", side one: " + sideOne + ", side two: " + sideTwo
                + ", color: " + getColor() + ", area: " + getArea());
    }

    @Override
    public double getArea() {
        return sideOne * sideTwo;
    }
}
