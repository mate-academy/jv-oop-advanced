package core.basesyntax;

public class RightTriangle extends Figure implements ArreaCounter {
    private int side = 0;
    RightTriangle(int side, Colors color){
        super();
        countArea();
        this.setColor(color);
    }
    @Override
    public void countArea() {
        float result = (float) (side * side * Math.sqrt(3/4));
        setArea(result);
    }
}
