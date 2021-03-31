package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    public void setSide (int side) {
        this.side = side;
    }
    public int getSide(){
        return side;
    }

    public void draw() {
        System.out.println("Figure: square, area: " + side * side
                + " sq. units, side length: " + side
                + "color: " + super.getColor());
    }

    public void area() {
        System.out.println("Area: " + side * side);
    }
}
