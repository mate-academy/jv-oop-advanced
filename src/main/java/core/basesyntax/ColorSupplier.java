package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {
        String[] color = new String[]{"red", "orange", "yellow", "green",
                "blue", "indigo", "violet"};
        int n = (int)Math.floor(Math.random() * color.length);
        return color[n];
    }
}
