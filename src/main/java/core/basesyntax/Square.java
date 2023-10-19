package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square() {

    }

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        String info = "Figure: square";
        info += ", area: " + getArea();
        info += " sq.units, side: " + side;
        info += " units, color: " + getColor().name();
        System.out.println(info);
    }
}
