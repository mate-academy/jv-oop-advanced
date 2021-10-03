package core.basesyntax;

public class Rectangle extends Figure implements FigureArea {

    private int sideA;
    private int sideB;

    public Rectangle() {

    }

    public Rectangle(int sideA, int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        setColor(color);
    }

    @Override
    public double areaCalculator() {
        return sideA * sideB;
    }

    @Override
    public void drawInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: rectangle, area: ").append(areaCalculator())
                     .append(" sq.units, sideA: ").append(sideA)
                     .append(" units, sideB: ").append(sideB)
                     .append(" units, color: ").append(getColor());
        System.out.println(stringBuilder);
    }
}
