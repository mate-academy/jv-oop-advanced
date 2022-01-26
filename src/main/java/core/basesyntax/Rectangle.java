package core.basesyntax;

public class Rectangle extends Figure {
    private double bigSide;
    private double smallSide;

    Rectangle(String color, double bigSide, double smallSide) {
        super(color);
        this.bigSide = bigSide;
        this.smallSide = smallSide;
    }

    public double getArea() {
        return bigSide * smallSide;
    }

    public String draw() {
        return "\n" + "Rectangle - " + getColor()
                + "\n" + "big side: " + bigSide
                + "\n" + "small side: " + smallSide
                + "\n" + "area: " + getArea();
    }
}
