package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstLeg;
    private int secondLeg;

    public IsoscelesTrapezoid() {
        super();
    }

    public IsoscelesTrapezoid(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public int getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder("Figure: isosceles trapezoid, area: ");
        builder.append(getArea());
        builder.append(" sq.units, firstLeg: ");
        builder.append(firstLeg);
        builder.append(" units, secondLeg: ");
        builder.append(secondLeg);
        builder.append(" units, color: ");
        builder.append(getColor().toLowerCase());
        System.out.println(builder);
    }
}
