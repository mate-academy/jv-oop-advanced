package core.basesyntax;

public class Rectangle extends Figure {
    private final int sizeOne;
    private final int sizeTwo;

    public Rectangle(int sizeOne, int sizeTwo, Color color) {
        super(color);
        this.sizeOne = sizeOne;
        this.sizeTwo = sizeTwo;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: "
                + calculateArea()
                + " sq.units, first side: "
                + getSizeOne()
                + " units, second side: "
                + getSizeTwo()
                + " units, color: "
                + getColor().name().toLowerCase());
    }

    public int getSizeOne() {
        return sizeOne;
    }

    public int getSizeTwo() {
        return sizeTwo;
    }

    @Override
    public double calculateArea() {
        return sizeOne * sizeTwo;
    }
}
