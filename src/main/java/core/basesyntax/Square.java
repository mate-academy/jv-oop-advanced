package core.basesyntax;

public class Square extends Figures {
    private int side;

    public Square(String color, int side) {
        super(color);

        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area:" + getArea()
                + " sq. units, side: "
                + " units, color: " + getColor());
    }
}
