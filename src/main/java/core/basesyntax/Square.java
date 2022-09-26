package core.basesyntax;

public class Square extends Figure {
    private double sideSquare;

    public Square(String color, double sideSquare) {
        super(color);
        this.sideSquare = sideSquare;
    }

    @Override
    public double getArea() {
        return sideSquare * sideSquare;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square" + " area: " + getArea() + " Square side: "
                + sideSquare + " triangle Side1: " + " color: " + color);
    }
}
