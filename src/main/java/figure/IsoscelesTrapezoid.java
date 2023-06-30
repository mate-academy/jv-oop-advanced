package figure;

public class IsoscelesTrapezoid extends Figure {
    private int baseSide = 0;
    private int twoSides = 0;

    public IsoscelesTrapezoid(String name) {
        setName(name);
        randomFigure();
    }

    public int getBaseSide() {
        return baseSide;
    }

    public void setBaseSide(int baseSide) {
        this.baseSide = baseSide;
    }

    public int getTwoSides() {
        return twoSides;
    }

    public void setTwoSides(int twoSides) {
        this.twoSides = twoSides;
    }

    public void resultArea() {
        setArea(
                (1 / 2)
                * getBaseSide()
                * Math.sqrt((getTwoSides() * getTwoSides())
                        - ((getBaseSide() * getBaseSide()) / 4))
        );
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println(", base: " + getBaseSide() + " units, "
                + "side: " + getTwoSides() + " units, " + "color: " + getColor());
    }

    @Override
    public void randomFigure() {
        super.randomFigure();
        setBaseSide(Figure.randomSideFigure());
        setTwoSides(Figure.randomSideFigure());
        resultArea();
    }
}
