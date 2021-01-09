package core.basesyntax;

public class ColorSupplier {
    private static String[] colors =
            {"white", "black", "green", "red", "blue", "pink", "yellow", "gray"};

    public static String generateColor() {
        int randomIndex = (int)(Math.random() * 8);
        return colors[randomIndex];
    }
}
