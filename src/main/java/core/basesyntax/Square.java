package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square() {
    }

    public Square(String color, double side) {
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
    public void drawShape() {
        System.out.println(String.format("%s%.1f%s%.1f%s%s",
                "Figure: square, area: ", this.getArea(), " sq. units, side length: ",
                this.getSide(), " units, color: ", this.getColor()));
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}
