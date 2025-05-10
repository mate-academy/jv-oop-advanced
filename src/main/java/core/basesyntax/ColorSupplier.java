package core.basesyntax;

public class ColorSupplier {

    private String[] stringsColor = {"white", "black", "green",
            "yellow", "blue", "red", "brown", "gray", "purple", "violet"};

    public String getRandomColor() {
        int colorNumber = (int) (Math.random() * stringsColor.length);
        return stringsColor[colorNumber];
    }
}
