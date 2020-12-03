package core.basesyntax;

public class Rectangle extends Figure {
    private double sideOne;
    private double sideTwo;
    private String name;

    public Rectangle(Color color, double sideOne, double sideTwo, String name) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.name = name;
    }

    public double getArea() {
        return Math.round(getSideOne() * getSideTwo());
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
        String returnLine = "Figure: " + getName() + ", area: " + getArea()
                + " sq. units, side one length: " + getSideOne()
                + " units, side two length: " + getSideTwo()
                + ", color: " + getColor().toString().toLowerCase();
        return returnLine;
    }
}
