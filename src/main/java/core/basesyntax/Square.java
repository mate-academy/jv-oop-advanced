package core.basesyntax;

public class Square extends Figure {
    private int size;

    public Square(String color, int size) {
        super(color);
        this.size = size;
    }

    @Override
    public double getArea() {
        return size * size;
    }

    @Override
    public void getDraw() {
        System.out.println("Figure: Square" + ", Color: " + color + ", area: " + getArea());
    }
}
