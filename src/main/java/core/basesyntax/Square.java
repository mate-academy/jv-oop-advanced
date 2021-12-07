package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square() {
        this.side = Math.random();
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Square:\n"
                + " side: " + side
                + " color: " + getColor()
                + " area: " + getArea());
    }
}
