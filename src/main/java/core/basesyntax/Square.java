package core.basesyntax;

public class Square extends Figures {
    private int highSquare;

    public Square(Colors color, int highSquare) {
        super(color);
        this.highSquare = highSquare;
    }

    @Override
    public int getArea() {
        return highSquare * highSquare;
    }

    @Override
    public void draw() {
        System.out.println("Square has been drawn");
    }

    @Override
    public String toString() {
        return "Shape: square, area: "
                + getArea() + " sq. units, Square high: "
                + highSquare + " units, color: " + getColor().toLowerCase();

    }
}
