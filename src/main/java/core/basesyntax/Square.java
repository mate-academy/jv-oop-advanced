package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
        super("Square", color);
        this.side = side;
    }

    @Override
    public double calculatorArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Name: " + this.name + ", Color: " + this.color.name()
                + ", Side: " + this.side + ", Area: " + this.calculatorArea() + ".");
    }
}
