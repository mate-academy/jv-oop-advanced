package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Square{" + "color= " + getColor()
                + " side="
                + side
                + " area="
                + this.getArea()
                + '}');
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
