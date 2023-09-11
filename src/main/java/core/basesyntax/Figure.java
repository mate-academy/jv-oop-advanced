package core.basesyntax;

public class Figure extends FigureProperty implements AreaCalculator, Skill {
    public Figure(Color color) {
        super(color);
    }

    @Override
    public int areaCalculation() {
        return 100;
    }

    @Override
    public void ableToDraw() {
        System.out.println("Figure: ...");
    }
}
