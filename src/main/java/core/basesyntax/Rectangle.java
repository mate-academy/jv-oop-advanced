package core.basesyntax;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB, String color) {
        this.sideA = sideA;
        this.sideB = sideB;
        setType("Rectangle");
        setColor(color);
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void drawFigure() {
        System.out.println(new StringBuilder().append("Figure: ")
                .append(getType())
                .append(", Area: ")
                .append(getArea())
                .append(" sq.units")
                .append(", sideA: ")
                .append(sideA)
                .append(" units")
                .append(", sideB: ")
                .append(sideB)
                .append(" units")
                .append(", color: ")
                .append(getColor()));
    }
}
