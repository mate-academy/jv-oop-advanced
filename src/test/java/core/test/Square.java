package core.test;

public class Square extends Figure{
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public Square(int side) {
        this.side = side;
    }
    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + " sq.units, side: " + side
                + " unit, color: " + getColor());
    }
}
