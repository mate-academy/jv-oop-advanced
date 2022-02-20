package core.basesyntax;

public class Rectangle extends Figure implements FigureInterfaces {
    public int firstSide;
    public int secondSide;

    public Rectangle(int firstSide, int secondSide) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getAreaFigure() {
        return firstSide * secondSide;
    }

    @Override
    public void drawFigure() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: rectangle, area: ")
                .append(getArea())
                .append(" sq.units, first side: ")
                .append(firstSide)
                .append(" sq.units, second side: ")
                .append(secondSide)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(builder.toString());
    }
}
