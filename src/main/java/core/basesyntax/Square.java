package core.basesyntax;

public class Square extends Figure {
    private final double sideA;

    public Square(String color, double sideA) {
        super(color);
        this.sideA = sideA;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder("Figure: Square, color: ");
        String text = stringBuilder
                .append(super.getColor())
                .append(", area: ")
                .append(getArea())
                .toString();

        System.out.println(text);
    }

    @Override
    public double getArea() {
        return Math.pow(sideA,2);
    }
}
