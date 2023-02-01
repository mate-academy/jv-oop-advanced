package core.basesyntax;

public class Rectangle extends Shape {
    private int firstLeg;
    private int secondLeg;

    public Rectangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double countArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle, area: " + countArea()
                          + " sq.units firstLeg: " + firstLeg + " units, secondLeg: "
                          + secondLeg + " units, color: " + getColor());
    }
}

