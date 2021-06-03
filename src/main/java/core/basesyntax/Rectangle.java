package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private int bigSide;
    private int smallSide;

    public Rectangle() {
        super("rectangle", new ColorSupplier().getRandomColor());
        bigSide = new Random().nextInt(100);
        smallSide = new Random().nextInt(100);
    }

    @Override
    public double getArea() {
        return smallSide * bigSide;
    }

    @Override
    public void draw() {
        StringBuilder drawBuilder = new StringBuilder();
        drawBuilder.append("Figure: ")
                .append(getTitle())
                .append(", area: ")
                .append(getArea())
                .append(" sq.units, bigSide: ")
                .append(bigSide)
                .append(" units, smallSide: ")
                .append(smallSide)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(drawBuilder.toString());
    }
}
