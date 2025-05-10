package core.basesyntax;

public class ColorSupplier {
    private static final String[] COLOR_LIST = new String[]{"yellow", "purple", "orange",
            "green", "green", "blue", "red", "pink"};

    public String getRandomColor() {
        return COLOR_LIST[(int) (Math.random() * COLOR_LIST.length)];
    }
}
