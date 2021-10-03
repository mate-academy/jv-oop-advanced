package core.basesyntax;

public class Rectangle extends Figure implements FigureArea {

    private int sideA, sideB;

    public Rectangle() {

    }

    public Rectangle(int sideA, int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.color = color;
    }

    @Override
        public double AreaCalculator() {
            return sideA * sideB;
        }

    @Override
    public void drawInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: rectangle, area: ").append(AreaCalculator())
                     .append(" sq.units, sideA: ").append(sideA)
                     .append(" units, sideB: ").append(sideB)
                     .append(" units, color: ").append(color);
        System.out.println(stringBuilder);
    }
}
