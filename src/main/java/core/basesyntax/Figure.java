package core.basesyntax;

public abstract class Figure {
    private String color;
    public static final int getNumberTwo = 2;
    public static final int numberThree = 3;
    public static final int numberFour = 4;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Figure(String color) {
        this.color = color;
    }



}
