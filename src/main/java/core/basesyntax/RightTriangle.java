package core.basesyntax;

public class RightTriangle extends Figure implements Drawer {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public int getFirstLeg() {
        return firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    public int getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2.0;
    }

    @Override
    public void draw() {
        System.out.println(
                new StringBuilder().append("Figure: RightTriangle, area: ")
                        .append(this.getArea())
                        .append(" sq.units, firstLeg: ")
                        .append(firstLeg)
                        .append(" sq.units, secondLeg: ")
                        .append(secondLeg)
                        .append(" units, color: ")
                        .append(this.getColour())
        );
    }
}
