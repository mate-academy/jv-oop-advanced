package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {
        int randomNumber = (int) (Math.random() * Colors.values().length);
        return Colors.values()[randomNumber].name().toLowerCase();
    }
}

