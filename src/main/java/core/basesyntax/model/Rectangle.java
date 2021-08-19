package core.basesyntax.model;

public class Rectangle extends Figure implements FigureRealisation {
    private double firstLeg;
    private double secondLeg;
    private ColorSupplier colorRectangle = new ColorSupplier();

    public Rectangle(String color, double firstLeg, double secondLeg) {
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

    public ColorSupplier getColorRectangle() {
        return colorRectangle;
    }

    @Override
    public double areaOfFigure() {
        return firstLeg * secondLeg;
    }

    @Override
    public void drawFigure() {
        System.out.println(
                new StringBuilder().append("Figure: Rectangle, area: ")
                        .append(areaOfFigure())
                        .append(" sq.units, side: ")
                        .append(getFirstLeg())
                        .append(" units, other side: ")
                        .append(getSecondLeg())
                        .append(", color: ")
                        .append(getColorRectangle().getRandomColor()));
    }
}
