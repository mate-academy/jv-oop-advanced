package core.basesyntax;

public class Square extends Figure {
    private String color;
    private final int side;

    public Square(int side, String color) {
        this.side = side;
        setColor(color);
    }

    @Override
    public int area() {
        return (int) side * side;
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Figure: square, " +
                "side: " + side + " units " +
                ", color: " + color +
                ", area: " + area() + " sq. units ";
    }
}