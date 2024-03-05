package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public String getArea() {

        return String.valueOf(side * side);
    }

    @Override
    public String draw() {
        return "Figure: Square, area:" + getArea()
                + "sq. units, side: " + side
                + "units, color:" + super.draw();
    }
}
