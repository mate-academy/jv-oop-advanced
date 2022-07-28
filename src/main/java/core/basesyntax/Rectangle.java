package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    @Override
    public double areaOfFigure() {
        return sideA * sideB;
    }

    @Override
    public void drawFigure() {
        StringBuilder sb = new StringBuilder();
        System.out.println(
                sb.append("Figure: rectangle, area: ")
                        .append(areaOfFigure())
                        .append(" sq.units, height: ")
                        .append(sideA)
                        .append("units, weight: ")
                        .append(sideB)
                        .append(" units, color: ")
                        .append(getColor()));
    }
}
