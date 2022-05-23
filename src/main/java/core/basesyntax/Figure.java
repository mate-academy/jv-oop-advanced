package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {

    public static final int getNumberTwo = 2;
    public static final int numberThree = 3;
    public static final int numberFour = 4;
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
