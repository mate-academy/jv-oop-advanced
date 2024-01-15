package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {
        String[] color = new String[]{"red", "orange", "yellow", "green",
                "blue", "indigo", "violet"};
        int indexOfColorArray = (int) (Math.random() * color.length);;
        return color[indexOfColorArray];
    }
}
