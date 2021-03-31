package core.basesyntax;

public class ColorSupplier {
    private static String[] colorsList = new String[]{"yellow", "purple", "orange",
            "green", "green", "blue", "red", "pink"};

    public String[] getColorsList() {
        return colorsList;
    }

    public static String randomColor() {
        return colorsList[(int) (Math.random() * colorsList.length)];
    }
}
