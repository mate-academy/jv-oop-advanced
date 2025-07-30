package core.basesyntax;

public abstract class Figure implements Drawable {
    String figureType;
    String color;

    Figure(String figureType, String color) {
        this.figureType = figureType;
        this.color = color;
    }

}
