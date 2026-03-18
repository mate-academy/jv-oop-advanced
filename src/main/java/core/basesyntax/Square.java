package core.basesyntax;

public class Square extends Figure {
    private final int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: "
                +
                this.getArea()
                +
                " sq. units, side: "
                +
                this.side
                +
                " units, color: "
                +
                this.color
        );
    }
}
