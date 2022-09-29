package core.basesyntax.figure;

public class Square extends Figure {
    private final int sizeOfSide;

    public Square(String color, int sizeOfSide) {
        super(color);
        this.sizeOfSide = sizeOfSide;
    }

    @Override
    public double getArea() {
        return sizeOfSide * sizeOfSide;
    }

    @Override
    public void draw() {
        String figureName = "square";
        String message = "Figure: " + figureName + ", area: " + getArea() + " sq.units,"
                + " side: " + sizeOfSide + ", color: " + getColor();
        System.out.println(message);
    }
}
