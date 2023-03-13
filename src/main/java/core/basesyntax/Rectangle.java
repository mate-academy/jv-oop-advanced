package core.basesyntax;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int firstSide, int secondSide, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        setColor(color);
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        System.out.println(builder.append("Figure: Rectangle, ").append("area: ")
                .append(getArea()).append(" sq.units, first side: ")
                .append(firstSide).append(" units, second side: ")
                .append(secondSide)
                .append(" units, color: ").append(getColor()));
    }
}
