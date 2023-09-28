package core.basesyntax;

public class Square extends Figure {
    private static final int POWER_VALUE = 2;
    private double side;

    public Square(String color, double side) {
        super(color.toLowerCase());
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, POWER_VALUE);
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: square, area ")
                .append(String.format("%.2f", calculateArea()))
                .append(" sq. units, side ").append(side)
                .append(" units, color: ").append(getColor());
        System.out.println(stringBuilder);
    }
}
