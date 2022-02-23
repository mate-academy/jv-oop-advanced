package core.basesyntax;

public class Square extends Figures {
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Square: side: "
                + side + " color: " + getColor() + " area: " + getArea());
    }
}
