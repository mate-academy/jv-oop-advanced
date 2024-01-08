package core.basesyntax;

public class Rectangle extends Figures {
    private int firstBases;
    private int secondBases;

    public Rectangle(String color, int firstBases, int secondBases) {
        super(color);
        this.firstBases = firstBases;
        this.secondBases = secondBases;
    }

    @Override
    public double getArea() {
        return firstBases * secondBases;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area:" + getArea()
                + " sq. units, side a: " + firstBases
                + " units, side b: " + secondBases
                + " units, color: " + getColor());
    }
}
