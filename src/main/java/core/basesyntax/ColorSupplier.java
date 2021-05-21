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
        int number = (int) (Math.random() * 12);
        return colors[number];
    }
}
