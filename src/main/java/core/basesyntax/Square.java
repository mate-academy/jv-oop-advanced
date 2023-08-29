package core.basesyntax;

public class Square extends Figure {
    private int firstLeg;

    public Square(String color,int firstLeg) {
        super(color);
        this.firstLeg = firstLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * firstLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Square, area: " + calculateArea()
                + ", first Leg: " + firstLeg + ", color: " + color);
    }
}
