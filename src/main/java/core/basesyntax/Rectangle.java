package core.basesyntax;

public class Rectangle extends Figure implements FigureMethods {
    private final float firstSide;
    private final float secondSide;

    public Rectangle(Colors color, float firstSide, float secondSide) {
        super(color, "Rectangle");
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double area() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName() + ", area: "
                + area() + " sq. units, firstSide: "
                + firstSide + " units, secondSide: "
                + secondSide + " units, color: " + getColor());
    }
}
