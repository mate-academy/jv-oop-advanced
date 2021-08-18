package core.basesyntax;

public class ColorSupplier {
    public static String getRandomColor() {
        String[] colours = {"Blue", "Black", "Red", "White", "Pink", "Grey", "Yellow"};
        int randomNumber = (int)  (Math.random() * 6);
        return colours[randomNumber];
    }
}
