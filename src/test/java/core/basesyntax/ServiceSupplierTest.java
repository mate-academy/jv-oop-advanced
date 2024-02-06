package core.basesyntax;

import core.basesyntax.enums.Color;
import core.basesyntax.model.Circle;
import core.basesyntax.service.ColorSupplier;
import core.basesyntax.service.FigureSupplier;
import org.junit.Assert;
import org.junit.Test;

public class ServiceSupplierTest {
    private FigureSupplier figureSupplier = new FigureSupplier();
    private ColorSupplier colorSupplier = new ColorSupplier();

    @Test
    public void figureSupplierGetDefaultFigureTest() {
        Circle expected = new Circle(Color.WHITE, 10);
        Assert.assertEquals(expected.toString(), figureSupplier.getDefaultFigure().toString());
    }

    @Test
    public void figureSupplierGetRandomFigureTest() {
        Assert.assertNotNull(figureSupplier.getRandomFigure());
    }

    @Test
    public void colorSupplierGetRandomColor() {
        Assert.assertNotNull(colorSupplier.getRandomColor());
    }
}