package core.basesyntax;

public class ColorSupplier implements FigureInterface {
    public String getRandomColor() {
        int index = (int) (Math.random() * COLORS.length);
        return COLORS[index];
    }
}
