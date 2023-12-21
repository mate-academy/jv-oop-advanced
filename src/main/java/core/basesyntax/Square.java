package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure " + this.getClass().getSimpleName() + "\n"
                + "Color " + color + "\n"
                + "Area " + getArea() + "\n"
                + "Side " + side);
    }
}
