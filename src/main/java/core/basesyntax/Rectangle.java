package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public void findArea() {
        if (getArea() == 0.0) {
            setArea(firstSide * secondSide);
        } else {
            System.out.println("The area has been already calculated");
        }
    }

    @Override
    public String draw() {
        return "Figure: Rectangle, "
                + "firstSide: " + firstSide
                + " units, secondSide: " + secondSide
                + " units, area: " + getArea()
                + " sq.units, " + "color: " + getColor();
    }
}
