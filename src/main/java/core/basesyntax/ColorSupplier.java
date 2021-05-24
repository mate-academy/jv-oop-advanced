package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {
        String[] colors = new String[]{
                "red",
                "orange",
                "yellow",
                "green",
                "blue",
                "purple",
                "white",
                "black",
                "grey",
                "silver",
                "gold",
                "brown"
        };
        int randomColorIndex = (int) (Math.random() * colors.length);
        return colors[randomColorIndex];
    }
}
