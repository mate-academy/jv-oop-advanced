package core.basesyntax.model;

public class Square extends Figure {
    private double firstLeg;
    private double secondLeg;

    public Square(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public double getFirstLeg() {
        return firstLeg;
    }

    public double getSecondLeg() {
        return secondLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println(
                new StringBuilder().append("Figure: Square, area: ")
                        .append(calculateArea())
                        .append(" sq.units, side: ")
                        .append(getFirstLeg())
                        .append(" units, other side: ")
                        .append(getSecondLeg())
                        .append(", color: ")
                        .append(getColor()));
    }
}
