package core.basesyntax;

public class ColorSupplier {
    public static String getRandomColor() {
        String[] colors = {"red", "blue", "white", "black", "pink", "green"};
        return colors[(int)(Math.random() * 5)];
    }
}
