package core.basesyntax;

public class Square extends Figure {
    public int sideLength;

    public Square(int sideLength, String color) {
        this.sideLength = sideLength;
        super.setColor(color);
    }

    @Override
    public void drawArea() {
        System.out.println(sideLength * sideLength);
    }
}
