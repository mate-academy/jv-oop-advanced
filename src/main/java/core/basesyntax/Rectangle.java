package core.basesyntax;

public class Rectangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public Rectangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder("Figure: rectangle, area: ")
                .append(dF.format(getArea())).append(" sq.units, first leg: ")
                .append(firstLeg).append(" units, second leg: ").append(secondLeg)
                .append(" ,units").append(", color: ").append(getColor()));
    }
}
