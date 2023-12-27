package core.basesyntax;

public abstract class Figure implements AreaCalculator, Drawable {
    private String color;
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public Figure(String color) {
        this.color = color;
    }

    public Figure(String color, int firstSide) {
        this.color = color;
        this.firstSide = firstSide;
    }

    public Figure(String color, int firstSide, int secondSide) {
        this.color = color;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public Figure(String color, int firstSide, int secondSide, int thirdSide) {
        this.color = color;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public String getColor() {
        return color;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public int getThirdSide() {
        return thirdSide;
    }
}
