package core.basesyntax;

public class Rectangle extends Figure implements ArreaCounter {
    private int firstLeg = 0;
    private int secondLeg = 0;

    Rectangle(int firstLeg, int secondLeg, Colors color) {
        super();
        countArea();
        this.setColor(color);
    }

    @Override
    public void countArea() {
        float result = (float) (firstLeg * secondLeg);
        setArea(result);
    }
}
