package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private int index = new Random().nextInt(5);
    private String color = new ColorSupplier().getRandomColor();

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Figure getRandomFigure() {
        int param1 = new Random().nextInt(100);
        int param2 = new Random().nextInt(100);
        int param3 = new Random().nextInt(50);
        switch (index) {
            case 1:
                return new Square(getColor(), param1);
            case 2:
                return new Circle(getColor(), param1);
            case 3:
                return new Rectangle(getColor(), param1, param2);
            case 4:
                return new RightTriangle(getColor(), param1, param2);
            default:
                return new IsoscelesTrapezoid(getColor(), param1, param2, param3);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name().toLowerCase(), 10);
    }
}
