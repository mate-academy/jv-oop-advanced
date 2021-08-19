package core.basesyntax.model;

public class Square extends Figure implements FigureRealisation {
    private double firstLeg;
    private double secondLeg;
    private ColorSupplier colorSquare = new ColorSupplier();

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

    public ColorSupplier getColorSquare() {
        return colorSquare;
    }

    @Override
    public double areaOfFigure() {
        return firstLeg * secondLeg;
    }

    @Override
    public void drawFigure() {
        System.out.println(
                new StringBuilder().append("Figure: Square, area: ")
                        .append(areaOfFigure())
                        .append(" sq.units, side: ")
                        .append(getFirstLeg())
                        .append(" units, other side: ")
                        .append(getSecondLeg())
                        .append(", color: ")
                        .append(getColorSquare().getRandomColor()));
    }
}
