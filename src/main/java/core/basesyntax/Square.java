package core.basesyntax;

public class Square extends Figure {
    private double side;

    public Square(String name) {
        super(name);
        side = new RandomNumberGenerator().getRandomProperties();
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String draw() {
        return "Figure: " + getName()
                + ", area: " + getArea()
                + ", side: " + getSide()
                + ", color: " + getColor();
    }
}
