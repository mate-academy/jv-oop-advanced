package core.basesyntax;

public class Circle extends Figure implements ArreaCounter{
    private float radius = 0;
    Circle(float radius, Colors color ){
        super();
        countArea();
        this.setColor(color);
    }
    @Override
    public void countArea() {
        float result = (float) (Math.PI*radius*radius);
        setArea(result);
    }
}
