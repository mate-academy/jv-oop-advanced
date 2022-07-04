package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public double getFirstLeg() {
        firstLeg = Math.random() * 100;
        return firstLeg;
    }

    public double getSecondLeg() {
        secondLeg = Math.random() * 100;
        return secondLeg;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        String draw = new String();
        draw = "Figure: right triangle, area: "
                + getArea()
                + " sq.units, firstLeg: "
                + firstLeg
                + " units,"
                + " secondLeg: "
                + secondLeg
                + " units, "
                + " color: "
                + getRandomColor();
        System.out.println(draw);
    }

    @Override
    public String toString() {
        return "RightTriangle{"
                + "firstLeg="
                + firstLeg
                + ", secondLeg="
                + secondLeg
                + '}';
    }
}