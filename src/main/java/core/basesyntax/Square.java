package core.basesyntax;

public class Square extends Figure {
    private final int leg;

    public Square(String color, int leg) {
        super(color);
        this.leg = leg;
    }

    @Override
    public int getArea() {
        return leg * leg;
    }

    @Override
    public void draw() {
        System.out.println("Square's leg is " + leg
                + "; area is " + getArea()
                + "; color is " + getColor());
    }
}
