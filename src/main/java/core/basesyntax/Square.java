package core.basesyntax;

public class Square extends Figure {
    private int side;
    private double area;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
        area = side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square; Side: " + side
                + " units; Area: " + area
                + "sq. units; Color: "
                + super.getColor());
    }
}
