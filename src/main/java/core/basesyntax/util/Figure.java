package core.basesyntax.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class Figure implements AreaCalculator, Drawer {
    private Logger logger = MyLogger.getLogger(FigureSupplier.class.getName());
    private String color;

    /**
     * @param childParams - map where keys represents method names that need to be called
     *                    for setting data for required fields and values - the data to be set.
     */
    public void setupAdditionalParams(HashMap<String, Object> childParams) {
        String[] keys = childParams.keySet().toArray(new String[0]);

        for (String methodName : keys) {
            Object value = childParams.get(methodName);
            tryInvokeMethod(methodName, value);
        }
    }

    /**
     * @param methodName - name of method that need to be invoked
     * @param value      - value to be set
     */
    private void tryInvokeMethod(String methodName, Object value) {
        Class<?> c = null;

        try {
            c = Class.forName(this.getClass().getName());
        } catch (ClassNotFoundException e) {
            logger.log(Level.WARNING, e.fillInStackTrace().toString());
        }

        if (c != null) {
            Method method = null;
            try {
                method = c.getDeclaredMethod(methodName, value.getClass());
            } catch (NoSuchMethodException e) {
                logger.log(Level.WARNING, e.fillInStackTrace().toString());
            }
            try {
                method.invoke(this, value);
            } catch (IllegalAccessException e) {
                logger.log(Level.WARNING, e.fillInStackTrace().toString());
            } catch (InvocationTargetException e) {
                logger.log(Level.WARNING, e.fillInStackTrace().toString());
            }
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
