package core.basesyntax.model.figure;

import core.basesyntax.model.Color;

public class Square extends Figure {
    private final int side;

    public Square(Color color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        String area = this.doubleToString(area());
        String status = new StringBuilder()
                .append("Figure: square, area: ")
                .append(area)
                .append(" sq.units, side: ")
                .append(side)
                .append(" units, color: ")
                .append(this.color).toString();
        System.out.println(status);
    }

    @Override
    public double area() {
        return Math.pow(side, 2);
    }
}
