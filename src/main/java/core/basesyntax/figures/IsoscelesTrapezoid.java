package core.basesyntax.figures;

import core.basesyntax.suppliers.ColorSupplier;
import java.util.Random;

public class IsoscelesTrapezoid extends Figure {
    private final String name = "isosceles trapezoid";
    private int topSide;
    private int downSide;
    private int height;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(int topSide, int downSide, int height, String color) {
        this.topSide = topSide;
        this.downSide = downSide;
        this.height = height;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return ((topSide + downSide) / 2f) * height;
    }

    @Override
    public String draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: ")
                .append(name)
                .append(", area: ")
                .append(getArea())
                .append(" sq.units, topSide = ")
                .append(topSide)
                .append(" units, downSide = ")
                .append(downSide)
                .append(" units, height = ")
                .append(height)
                .append(" units, color: ")
                .append(getColor());
        return stringBuilder.toString();
    }

    @Override
    public Figure getRandomProperties() {
        int rndTopSide = random.nextInt(100);
        int rndDownSide = random.nextInt(100);
        int rndHeight = random.nextInt(100);
        String rndColor = colorSupplier.getRandomColor();
        Figure iscTrapezoid = new IsoscelesTrapezoid(rndTopSide, rndDownSide, rndHeight, rndColor);
        return iscTrapezoid;
    }
}
