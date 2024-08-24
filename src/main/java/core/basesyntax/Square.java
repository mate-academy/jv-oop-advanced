package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(double side, String color) {
        super.setColor(color);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side,2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area:" + calculateArea() + "sq. units, side: "
                + side + " color: " + getColor());
    }
}
