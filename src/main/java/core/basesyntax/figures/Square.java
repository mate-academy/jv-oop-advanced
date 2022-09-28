package core.basesyntax.figures;

import core.basesyntax.suppliers.ColorSupplier;
import java.util.Random;

public class Square extends Figure {
    private final String name = "square";
    private int side;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public Square() {
    }

    public Square(int side, String color) {
        this.setColor(color);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: ")
                .append(name)
                .append(", area: ")
                .append(getArea())
                .append(" sq.units, side = ")
                .append(side)
                .append(" units, color: ")
                .append(getColor());
        return stringBuilder.toString();
    }

    @Override
    public Figure getRandomProperties() {
        int randomSide = random.nextInt(100);
        String randomColor = colorSupplier.getRandomColor();
        Figure square = new Square(randomSide, randomColor);
        return square;
    }
}
