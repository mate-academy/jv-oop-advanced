package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstSide;
    private int secondSide;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstSide = firstLeg;
        this.secondSide = secondLeg;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(int firstLeg) {
        this.firstSide = firstLeg;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondSide = secondLeg;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide / 2.0;
    }

    @Override
    public void draw() {
        System.out.println(
                new StringBuilder().append("Figure: RightTriangle, area: ")
                        .append(getArea())
                        .append(" sq.units, firstSide: ")
                        .append(firstSide)
                        .append(" sq.units, secondSide: ")
                        .append(secondSide)
                        .append(" units, color: ")
                        .append(getColor())
        );
    }
}
