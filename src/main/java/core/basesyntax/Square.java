package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, double side) {
        super(color);
        this.side = (int) side;
    }

    public Square(String color) {
        super(color);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Фігура: квадрат, площа: " + getArea()
                + " кв. одиниць, сторона: " + side + " одиниць, колір: " + getColor());
    }
}
