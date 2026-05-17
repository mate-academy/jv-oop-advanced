package core.basesyntax;

public class Square extends Figure {
    private int side;

    Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                + this.calculateArea()
                + "sq. units, side: "
                + this.side
                + " units, color: "
                + this.color);
    }
}
