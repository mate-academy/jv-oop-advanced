package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private int side;

    public Square() {
        super("squar", new ColorSupplier().getRandomColor());
        side = new Random().nextInt(100);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        StringBuilder drawBuilder = new StringBuilder();
        drawBuilder.append("Figure: ")
                .append(getTitle())
                .append(", area: ")
                .append(getArea())
                .append(" sq.units, side: ")
                .append(side)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(drawBuilder.toString());
    }
}
