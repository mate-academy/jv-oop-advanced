package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {
        Colors[] colorsArray = Colors.values();
        int randomValue = (int) (Math.random() * colorsArray.length);
        return colorsArray[randomValue].getColor();
    }
}
