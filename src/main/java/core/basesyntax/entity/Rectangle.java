package core.basesyntax.entity;


public class Rectangle extends Figure implements Printer {
    public static final double MAX_FIRST_SIDE = 50;
    public static final double MAX_SECOND_SIDE = 50;
    private double firstSide;
    private double secondSide;

    public Rectangle(Color color, double firstSide, double secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    @Override
    public void printInfo() {
        System.out.println(new StringBuilder().append(" IsoscelesTrapezoid, area: ")
                .append(firstSide * secondSide)
                .append(" sq.units,")
                .append(" firstSide: ")
                .append(firstSide)
                .append(" units")
                .append(" secondSide: ")
                .append(secondSide)
                .append(" units, color: ")
                .append(getColor()));
    }
}
