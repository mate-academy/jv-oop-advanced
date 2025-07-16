package core.basesyntax;

public class Square extends Figure {

    private String color;
    private int side;

    public Square(String color, int side) throws Exception {
        this.color = color;
        if (side <= ZERO) {
            throw new Exception("Side is less than one");
        }
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        return "Figure: "
                + "square, "
                + "area: " + getArea() + " sq. units, "
                + "side: " + side + " units, "
                + "color: " + color;
    }

}
