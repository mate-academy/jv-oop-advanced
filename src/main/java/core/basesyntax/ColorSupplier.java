package core.basesyntax;

public class ColorSupplier extends RandomSupplier {
    private final Color[] colors = Color.values();

    public Color getRandomColor() {
        int randomNum = getRandomInt(colors.length);
        return colors[randomNum];
    }

}
