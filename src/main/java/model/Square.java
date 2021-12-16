package model;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public Object draw() {
        System.out.println("Figure: " + this.getClass().getSimpleName() + ", area: " + getArea()
                + " sq.units, side: " + side + " units, color: " + color);
        return null;
    }
}
