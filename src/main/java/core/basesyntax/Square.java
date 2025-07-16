package core.basesyntax;

public class Square extends Figure {

    private String color;
    private int side;

    public Square(String color, int side) {
        this.color = color;
        if (side <= 0) {
            System.out.println("Side is less than one");
            return;
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
