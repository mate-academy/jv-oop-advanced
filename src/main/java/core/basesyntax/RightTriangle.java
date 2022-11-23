package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg,String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public int getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        StringBuilder info = new StringBuilder("Figure: right triangle, area: ");
        info.append(getArea());
        info.append(" sq.units, first leg: ");
        info.append(firstLeg);
        info.append(" units, second leg: ");
        info.append(secondLeg);
        info.append(" units, color: ");
        info.append(getColor().toLowerCase());
        System.out.println(info);
    }
}
