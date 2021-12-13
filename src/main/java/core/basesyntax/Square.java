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
    public void draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName()
                + ", area: " + getArea() + " sq.units, "
                + "side: " + size + " units, "
                + "color: " + super.getColor());
    }
}
