package core.basesyntax;

public class ColorSupplier {
    public String getRandomColor() {

        String[] colors = {"red","blue","white","black","green","purple"};
        int index = (int) (Math.random() * colors.length);
        return colors[index];
    }
}
