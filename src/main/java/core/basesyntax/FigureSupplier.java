package core.basesyntax;

import java.util.Random;

public class FigureSupplier extends UnitSupplier {
    private int maxValue = 5;
    private Random random = new Random();
    private ColorSupplier supplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(maxValue);
        String color = supplier.getRandomColor().toString();
        return switch (randomNumber) {
            case 0 -> new Square(getRandomNumber(), color);
            case 1 -> new Rectangle(getRandomNumber(), getRandomNumber(), color);
            case 2 -> new RightTriangle(getRandomNumber(), getRandomNumber(), color);
            case 3 -> new Circle(getRandomNumber(), color);
            case 4 -> new IsoscelesTrapezoid(getRandomNumber(), getRandomNumber(),
                    getRandomNumber(), color);
            default -> new Circle(10, "WHITE");
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(10, "WHITE");
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }

    @Override
    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public ColorSupplier getSupplier() {
        return supplier;
    }

    public void setSupplier(ColorSupplier supplier) {
        this.supplier = supplier;
    }
}
