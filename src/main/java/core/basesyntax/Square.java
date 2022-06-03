package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {

        return side*side;
    }

    @Override
    public void draw() {
        System.out.printf("Figure square, area: %.1f"
                            + " sq. units, side: %.1f"
                            + " units, color: %s",
                            area(), side, color);
    }
}
