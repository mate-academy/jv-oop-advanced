package core.basesyntax;

public class Square extends Figure {
    private double side;
    public Square () {
        double defaultSide = 10;
        side = defaultSide;
    }
    public Square (String color, double side) {
        super(color);
        this.side = side;
    }
    public double getSide () {
        return side;
    }
    public void setSide (double side) {
        this.side = side;
    }
    @Override
    public void Draw () {
        System.out.println("" + getColor() + " square with area of " + Area()
                + " sq.units and side of " + side + " units");
    }
    @Override
    public double Area () {
        return side * side;
    }
}
