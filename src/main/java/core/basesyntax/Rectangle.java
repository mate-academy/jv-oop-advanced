package core.basesyntax;

public class Rectangle extends Figure {
    private double firstSide;
    private double secondSide;

    public Rectangle(String color, double firstSide, double secondSide) {
        super(FigureType.RECTANGLE, color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        System.out.println(builder.append("Figure: ").append(getName())
                .append(", color: ").append(getColor()).append(", first side: ").append(firstSide)
                .append(", second side: ").append(secondSide).append(", area: ")
                .append(getArea()).toString());
    }
}
