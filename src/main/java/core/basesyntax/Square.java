package core.basesyntax;

public class Square extends Figure {
    private int size;

    public Square(String color, int size) {
        super(color);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize() {
        this.size = size;
    }

    @Override
    public double getArea() {
        return size * size;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area:" + getArea() + "sq.units, size: "
                + size + " units, color: " + color);
    }
}
