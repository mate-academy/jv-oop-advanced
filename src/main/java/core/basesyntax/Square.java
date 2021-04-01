package core.basesyntax;

public class Square extends Figure {
    private int size;

    public Square(String color, String name, int size) {
        super(color, "Square");
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public double getArea() {
        return size * size;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea()
                + " sq. units, size length: "
                + getSize() + " units, color: "
                + getColor());
    }
}
