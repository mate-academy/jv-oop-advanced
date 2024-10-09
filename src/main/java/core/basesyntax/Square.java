package core.basesyntax;

public class Square extends Figure {
    private int length;

    public Square(String color, int length) {
        super(color);
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " sq. units, "
                            + "side: " + length + "units, "
                            + "color:" + getColor());
    }

    @Override
    public double getArea() {
        return length * length;
    }
}
