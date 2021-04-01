package core.basesyntax;

public class RightTriangle extends Figure {
    private double oneSide;
    private double secondSide;

    public RightTriangle(String name) {
        super(name);
        this.oneSide = new RandomNumberGenerator().getRandomProperties();
        this.secondSide = new RandomNumberGenerator().getRandomProperties();
    }

    public double getHypotenuse() {
        return Math.sqrt(Math.pow(oneSide, 2) + Math.pow(secondSide, 2));
    }

    public double getHeight() {
        return oneSide * secondSide / getHypotenuse();
    }

    @Override
    public double getArea() {
        return 0.5 * getHypotenuse() * getHeight();
    }

    @Override
    public String draw() {
        return "Figure: " + getName()
            + ", area: " + getArea()
            + ", height: " + getHeight()
            + ", color: " + getColor();
    }
}
