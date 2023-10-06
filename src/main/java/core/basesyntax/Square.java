package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side,String color) {
        this.side = side;
        setColor(color);
        getArea();
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        System.out.println("Square{" + "side=" + side
                + ", color='" + getColor() + '\''
                + ", area=" + getArea() + '}');
        return "";
    }
}
