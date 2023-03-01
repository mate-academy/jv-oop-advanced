package core.basesyntax.model;

public class Square extends Figure {
    private final int side;

    public Square(int side, String color) {
        super.setColor(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append("Figure: square, area: ")
                .append(String.format("%.1f", getArea()))
                .append(" sq.units, side: ")
                .append(side).append(" units, color: ")
                .append(super.getColor().toLowerCase()));
    }
}
