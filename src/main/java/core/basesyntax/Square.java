package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, Color color) {
        super(color);
        this.side = side;
    }

    public void setFirstSide(double side) {
        if (side <= 0) {
            System.out.println("Gometric value need to be greater than zero");
        } else {
            this.side = side;
        }
    }

    public double getFirstSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: square, area: " + getArea() + " sq. units"
                        + ", side: " + side + " units"
                        + ", color: " + getColor());
    }
}
