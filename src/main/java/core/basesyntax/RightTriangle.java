package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg > 0 ? firstLeg : 0;
        this.secondLeg = secondLeg > 0 ? secondLeg : 0;
    }

    @Override
    public double getArea() {
        return this.firstLeg * this.secondLeg / 2.0;
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder().append(" Figure: right triangle, area: ")
                .append(this.getArea()).append(" sq.units, firstLeg: ")
                .append(this.getFirstLeg()).append(" units, ")
                .append("secondLeg: ").append(this.getSecondLeg()).append(" units, color: ")
                .append(this.getColor()).toString());
    }

    public int getFirstLeg() {
        return this.firstLeg;
    }

    public int getSecondLeg() {
        return this.secondLeg;
    }
}
