package core.basesyntax;

public class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }


    public void draw(Figure figure) {
        System.out.println(figure);
    }

    @Override
    public String toString() {
        return "Figure: " + getClass().getSimpleName() +
                ", color: " + color.toLowerCase() +
                ", ";
    }
}
