package core.basesyntax;

public class ColorSupplier {
    private RandomColor color = new RandomColor();
    private String color1 = color.getColor();

    public String getRandomColor() {
        return color1;
    }
}
