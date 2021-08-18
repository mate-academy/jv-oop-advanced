package core.basesyntax;

public class ColorSupplie {

    private String[] colors = {"red", "blue", "green", "brown", "orange",
                               "black", "orange", "pink", "yellow"};

    public String getRandomColor() {
        return colors[(int) (Math.random() * colors.length)];
    }
}
