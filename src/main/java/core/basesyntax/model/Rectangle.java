package core.basesyntax.model;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String name, String color, int firstSide, int secondSide) {
        super(name, color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("firstSide: " + firstSide + ", secondSide: " + secondSide);
    }

    @Override
    public double area() {
        return firstSide * secondSide;
    }
}
