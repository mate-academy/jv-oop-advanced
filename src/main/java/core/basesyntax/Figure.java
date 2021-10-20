package core.basesyntax;

public class Figure implements Drawable {
    private String color;

    public Figure() {
    }

    public Figure(String color) {
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void toDraw() {
        System.out.println("I am just a figure");
    }
}
