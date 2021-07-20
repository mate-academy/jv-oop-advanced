package core.basesyntax;

public class ColorSupplier {

    public String getRandomColor() {
        String[] color = {"white", "black", "green", "red", "blue", "pink",
                "yellow", "orange", "lime", "brown"};
        return color[(int) (Math.random() * 10)];
    }
}
