package core.basesyntax;

public class Square extends Figure {
    private double side;

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public Figure drawState() {
        System.out.println("Name = " + getName() + " Area = " + area()
                + " Side = " + side + " Color = " + getColor());
        return null;
    }
}
