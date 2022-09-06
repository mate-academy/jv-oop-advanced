package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }


    @Override
    public String draw() {
        return "Rectangle{"
                + "firstSide=" + firstSide
                + ", secondSide=" + secondSide
                + ", color='" + color + '\''
                + '}';
    }
}
