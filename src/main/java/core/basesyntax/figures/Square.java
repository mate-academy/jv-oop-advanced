package core.basesyntax.figures;

public class Square extends Figure {
    private double side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getFigureArea() {
        return side * side;
    }

    @Override
    public void figureDraw() {
        System.out.println("figure is: Square, " + "area is: " + getFigureArea() + " sq.units, "
                + "side is: " + side + " units, " + "color is: " + getColor());
    }

}
