package core.basesyntax.figures;

public class Figure  implements Drawable, Calculable{
    public Figure(String color) {
        this.color = color;
    }

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
