package core.basesyntax;

public class Circle implements Figure {
    final int radius = 10;
    final String color = "WHITE";
    @Override
    public void draw() {
        System.out.println("Figure: circle, radius: " + radius + ",color: " + color);
    }
}

