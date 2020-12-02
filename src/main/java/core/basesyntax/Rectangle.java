package core.basesyntax;

public class Rectangle extends Figure {

    private double sideOne;
    private double sideTwo;
    private  String name;

    public Rectangle(String color, double sideOne, double sideTwo) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public double getArea() {
        return getSideOne() * getSideTwo();
    }

    public double getSideOne() {
        return sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public String getName() {
        return name;
    }

    public String draw() {
        String returnLine = "Figure: rectangle, " + "area: " + getArea() + " sq. units, side one length: " +
                getSideOne() + " units, side two length: " + getSideTwo() + ", color: " + getColor();
        return returnLine;
    }

}
