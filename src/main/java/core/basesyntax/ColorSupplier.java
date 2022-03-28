package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private int index = new Random().nextInt(Color.values().length);

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getRandomColor() {
        String randomColor = Color.values()[getIndex()].toString();
        return randomColor.toLowerCase();
    }
}
