package core.basesyntax.figures;

public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: rectangle, area: ").append(getArea())
                .append(", firstSide: ").append(firstSide)
                .append(", secondSide: ").append(secondSide)
                .append(", color:").append(getColor())
                .append('\n');
        System.out.println(stringBuilder.toString());
    }
}
