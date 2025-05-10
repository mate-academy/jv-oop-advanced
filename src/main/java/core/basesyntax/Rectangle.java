package core.basesyntax;

public class Rectangle extends Figure {
    private final double sideA;
    private final double sideB;

    public Rectangle(String color, double sideA, double sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder("Figure: Rectangle, color: ");
        String text = stringBuilder
                .append(super.getColor())
                .append(", area: ")
                .append(getArea())
                .toString();
        System.out.println(text);
    }

    @Override
    public double getArea() {
        double s = 0.5 * sideA * sideB;
        return Math.sqrt(s);
    }
}
