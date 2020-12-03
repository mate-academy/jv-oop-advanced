package core.basesyntax;

import java.util.Random;

public class Square extends Figure implements ColorCreator {
    private int width;

    public Square(int width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int showWidth() {
        return width;
    }

    @Override
    public double countArea() {
        return width * width;
    }

    @Override
    public Color getColor() {
        int randomInteger = new Random().nextInt(Color.values().length);
        return Color.values()[randomInteger];
    }

    @Override
    public String onScreen() {
        return "Figure: square, area: " + countArea() + " sq. units, width "
                + showWidth() + ", color: " + getColor().name().toLowerCase();
    }
}
