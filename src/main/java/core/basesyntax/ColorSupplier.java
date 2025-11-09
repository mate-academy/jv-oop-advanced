package core.basesyntax;

public class ColorSupplier {
    public static final String MAGIC_COLOR = "White";
    public static final String[] COLOR_NAMES = {
            "Red", "Green", "Blue", "Yellow", "Orange",
            "Purple", "Pink", "Cyan", "Magenta", "Brown",
            "Black", "White", "Gray", "Teal", "Lime"
    };

    public String getRandomColor() {
        int index = (int) (Math.random() * COLOR_NAMES.length);
        return COLOR_NAMES[index];
    }

    public String getDefaultColor() {
        return MAGIC_COLOR;
    }
}
