package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements FigureArea {

    private int height, sideA, sideB;

    public IsoscelesTrapezoid() {

    }

    public IsoscelesTrapezoid(int sideA, int sideB, int height, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        this.color = color;
    }

    @Override
    public double AreaCalculator() {
        return ((double) height * (sideA + sideB)) / 2;
    }

    @Override
    public void drawInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: isosceles trapezoid, area: ").append(AreaCalculator())
                .append(" sq.units, sideA: ").append(sideA)
                .append(" units, sideB: ").append(sideB)
                .append(" units, height: ").append(height)
                .append(" units, color: ").append(color);
        System.out.println(stringBuilder);
    }
}
