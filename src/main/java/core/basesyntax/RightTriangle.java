package core.basesyntax;

public class RightTriangle extends Figure {
    protected int firstLeg;
    protected int secondLeg;

    public RightTriangle(int cathetusA, int cathetusB, String name, String color) {
        super(color, name);
        this.firstLeg = cathetusA;
        this.secondLeg = cathetusB;
    }

    @Override
    public double getArea() {
        return (double) 1 / 2 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + this.getName() + ", area: "
                + getArea() + " sq. units, firstLeg: " + firstLeg + " units, secondLeg "
                + secondLeg + " units, color " + this.getColor());
    }
}
