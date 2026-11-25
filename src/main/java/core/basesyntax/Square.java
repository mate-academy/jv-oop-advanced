package core.basesyntax;

public class Square extends Figure implements Drawable, AreaCalculator {
    private int side;

    Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    void printColor() {
        super.printColor();
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void drawable() {
        System.out.println("Figure: Square, area: " + getArea()
                + " sq. units, side: " + side + " units, color: " + getColor());
    }


}
