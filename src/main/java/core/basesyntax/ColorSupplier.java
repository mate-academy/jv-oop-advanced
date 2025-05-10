package core.basesyntax;

public class ColorSupplier {
    private static final String[] colors = new String[]
            {"black", "red", "yellow", "white", "pink", "green", "grey", "orange", "blue"};

    public String getRandomColor() {
        int colorRandom = (int) (Math.random() * colors.length);
        return colors[colorRandom];
    }
}
