package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor(int numberColor) {
        String[] colors = new String[]{"red", "grey", "white", "black", "yellow", "orange", "blue"};
        return colors[numberColor];
    }
}
