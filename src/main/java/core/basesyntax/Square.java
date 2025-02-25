package core.basesyntax;

public class Square extends Figure {
    private final int sideOne;

    public Square(String color, int sideOne) {
        super(color);
        this.sideOne = sideOne;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, side one: " + this.sideOne + ". Color: " + this.color);
    }
}
