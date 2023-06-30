package core.basesyntax.figure;

public class Square extends Figure {

    private int side = 0;

    public Square(String name) {
        setName(name);
        randomFigure();
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public void resultArea() {
        setArea(side * side);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", side: " + side + " units, " + "color: " + getColor());
    }

    @Override
    public void randomFigure() {
        super.randomFigure();
        side = randomSideFigure();
        resultArea();
    }
}
