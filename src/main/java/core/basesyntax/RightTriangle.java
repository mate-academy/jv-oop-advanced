package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String name, String color, int firstLeg, int secondLeg) {
        this.name = name;
        this.color = color;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public int area() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + name
                + ", color: " + color
                + ", area: " + area() + " sq.units"
                + ", first leg: " + firstLeg
                + ", second leg: " + secondLeg
                + ";"
        );
    }
}
