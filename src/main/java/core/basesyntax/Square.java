package core.basesyntax;

public class Square extends Figure {
    private double sideSquare;

    public Square(String color, String name, double sideSquare) {
        super(color, name);
        this.sideSquare = sideSquare;
    }

    @Override
    public double getArea() {
        return sideSquare * sideSquare;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name + " area: " + getArea() + " Square side: "
                + sideSquare + " triangle Side1: " + " color: " + color);

    }
}
