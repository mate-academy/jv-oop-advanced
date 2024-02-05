package core.basesyntax.model;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(String name,
                              String color,
                              int firstSide,
                              int secondSide,
                              int height) {
        super(name, color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;

    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("First Side: " + firstSide + ", Second Side: " + secondSide
                + ", Parallel Side: " + height);
    }

    @Override
    public double area() {
        return ((firstSide + secondSide) * height) / 2;
    }
}
