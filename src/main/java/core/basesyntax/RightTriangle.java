package core.basesyntax;

public class RightTriangle extends Figure {
    private final int leg;
    private final int high;

    public RightTriangle(String color, int leg, int high) {
        super(color);
        this.leg = leg;
        this.high = high;
    }

    @Override
    public int getArea() {
        return (leg * high) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Right Triangle's leg is " + leg
                + "; high is " + high
                + "; area is " + getArea()
                + "; color is " + getColor());
    }
}
