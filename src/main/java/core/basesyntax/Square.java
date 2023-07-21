package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public int area() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getType()
                + " area: " + area() + "sq.units, side: "
                + side + "units, color: " + getColor());
    }

    @Override
    public String getType() {
        return "square";
    }

}
