package core.basesyntax;

public abstract class Figure implements Drawable {
    private String color;

    public Figure(ColorSupplier color) {
        this.color = color.getRandomColor();
    }

    public abstract double getArea();

    public String getColor() {
        return color;
    }
    //intarface draw ,pole na kolor
}
