package core.basesyntax;

public class Rectangle extends Figure {
    private final int sideOne;
    private final int sideTwo;

    public Rectangle(String color, int sideOne, int sideTwo) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, side one: " + sideOne + ", side two: "
                + sideTwo + ". Color: " + color);
    }
}
