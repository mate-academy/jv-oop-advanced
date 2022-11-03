package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double area;
    private int firstLeg;
    private int secondLeg;

    public IsoscelesTrapezoid() {
        super();
    }

    public IsoscelesTrapezoid(String color, Double area, int firstLeg, int secondLeg) {
        super();
        this.area = area;
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public void area() {
        setArea((double)(firstLeg * secondLeg) / 2);
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder("Figure: isosceles trapezoid, area: ");
        builder.append(area);
        builder.append(" sq.units, firstLeg: ");
        builder.append(firstLeg);
        builder.append(" units, secondLeg: ");
        builder.append(secondLeg);
        builder.append(" units, color: ");
        builder.append(super.getColor().toLowerCase());
        System.out.println(builder);
    }
}
