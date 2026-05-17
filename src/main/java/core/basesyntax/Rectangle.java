package core.basesyntax;

public class Rectangle extends Figure {
    private int sideOne;
    private int sideTwo;

    Rectangle(String color, int sideOne, int sideTwo) {
        super(color);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: "
                + this.calculateArea()
                + "sq. units, side one: "
                + this.sideOne
                + " units, side two: "
                + this.sideTwo
                + " units, color: "
                + this.color);
    }

    @Override
    public double calculateArea() {
        return this.sideOne * this.sideTwo;
    }
}
