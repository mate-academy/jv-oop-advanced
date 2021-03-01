package core.basesyntax;

public class ColorSupplier extends RandomNumber {
    String[] colorList = new String[]{"yellow", "orange", "blue", "white", "black", "brown", "purple", "green"};

    public String getRandomColor() {
        return getProperty(colorList);
    }
}
