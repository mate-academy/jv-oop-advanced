package core.basesyntax;

public class Square extends Figure {
    private double side;

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
                "Figure: square, area: ", this.calculateArea(), " sq. units, side length: ",
                this.getSide(), " units, color: ", this.getColor()));
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }
}
