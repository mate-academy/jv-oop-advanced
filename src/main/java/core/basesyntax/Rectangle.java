package core.basesyntax;

public class Rectangle extends Figure implements Area {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double areaCalculatro() {
        return 0;
    }
}
