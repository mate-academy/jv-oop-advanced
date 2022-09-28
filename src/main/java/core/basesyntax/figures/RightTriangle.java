package core.basesyntax.figures;

import core.basesyntax.suppliers.ColorSupplier;
import java.util.Random;

public class RightTriangle extends Figure {
    private final String name = "right triangle";
    private int firstLeg;
    private int secondLeg;
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final Random random = new Random();

    public RightTriangle() {
    }

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public String draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: ")
                .append(name)
                .append(", area: ")
                .append(getArea())
                .append(" sq.units, firstLeg = ")
                .append(firstLeg)
                .append(" units, secondLeg = ")
                .append(secondLeg)
                .append(" units, color: ")
                .append(getColor());
        return stringBuilder.toString();
    }

    @Override
    public Figure getRandomProperties() {
        int randomFirstLeg = random.nextInt(100);
        int randomSecondLeg = random.nextInt(100);
        String randomColor = colorSupplier.getRandomColor();
        Figure rightTriangle = new RightTriangle(randomFirstLeg, randomSecondLeg, randomColor);
        return rightTriangle;
    }
}
