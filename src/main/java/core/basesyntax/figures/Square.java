package core.basesyntax.figures;

public class Square extends Figure {
    private final int size;

    public Square(String color, int size) {
        super(color);
        this.size = size;
    }

    @Override
    public double getFigureArea() {
        return (double) size * size;
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", size: " + size
                + ", area: " + getFigureArea()
                + ".");
    }
}
