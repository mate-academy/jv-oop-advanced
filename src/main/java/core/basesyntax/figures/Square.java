package core.basesyntax.figures;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        this.color = color;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void draw() {
        System.out.print("\nType: square"
                + "\nSide: " + side
                + "\nColor: " + color
                + "\n-----------");
    }
}
