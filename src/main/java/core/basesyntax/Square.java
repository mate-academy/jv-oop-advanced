package core.basesyntax;

public class Square extends Figure implements Drawable {
    private int side;

    public Square(int side, Color color) {
        super(color, calculateArea(side), "Square");
        this.side = side;
    }

    public void draw() {
        System.out.println("Figure: " + getName() + ", area: " + getArea()
                + " sq. units, side: " + getSide() + " units, color: " + getColor());
    }

    private static double calculateArea(int side) {
        return Math.pow(side, 2);
    }

    public int getSide() {
        return side;
    }
}
