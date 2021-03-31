package core.basesyntax;

public class ColorSupplier {
    private String[] colors = new String[] {"black", "white", "green", "red", "gray", "purple",
            "pink", "yellow", "brown", "blue", "orange"};

    public String[] getColors() {
        return colors;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public String randomColor() {
        int randomNumber = (int)((Math.random() * colors.length) + 1);
        return colors[randomNumber - 1];
    }
}
