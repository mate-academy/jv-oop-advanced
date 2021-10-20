package core.basesyntax;

public class Isosceles_trapezoid extends Figure implements ArreaCounter {
    private int bottomBase;
    private int upperBase;
    private int edge;

    public Isosceles_trapezoid(int bottomBase, int upperBase, int edge, Colors colors){
        super();
        this.bottomBase = bottomBase;
        this.upperBase = upperBase;
        this.edge = edge;
        countArea();
        this.setColor(colors);
    }

    @Override
    public void countArea() {
        float result;
//        Brahmagupta formula
        float p = upperBase + bottomBase + 2 * edge;
        result = (float) (Math.sqrt(p - upperBase) * (p - bottomBase) * (p - edge) * (p - edge));
        setArea(result);
    }

}
