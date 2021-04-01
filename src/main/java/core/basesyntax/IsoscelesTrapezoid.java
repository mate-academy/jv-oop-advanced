package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstBaseSide;
    private double secondBaseSide;
    private double height;

    public IsoscelesTrapezoid(String name) {
        super(name);
        this.firstBaseSide = new RandomNumberGenerator().getRandomProperties();
        this.secondBaseSide = new RandomNumberGenerator().getRandomProperties();
        this.height = new RandomNumberGenerator().getRandomProperties();
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return ((firstBaseSide + secondBaseSide) / 2) * getHeight();
    }

    @Override
    public String draw() {
        return "Figure: " + getName()
            + ", area: " + getArea()
            + ", height: " + getHeight()
            + ", color: " + getColor();
    }
}
