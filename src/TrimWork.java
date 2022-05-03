import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
class Trim {
    public Object methTrim(Object myObj) throws InvocationTargetException, IllegalAccessException {
        Class pointClass = myObj.getClass();
        Method[] methods = pointClass.getMethods();
        for (Method m : methods) {
            if (m.getName().equals("getX") || m.getName().equals("getY") || m.getName().equals("getValue")) {
                String trimmed = (String) m.invoke(myObj);
                System.out.println(trimmed.trim());
            }
        }
        return "";
    }
}
class Point {
    public String x, y, value;
    Point(String x, String y, String value) {
        this.x = x;
        this.y = y;
        this.value = value;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        Point point = new Point("   2 0  ", "       4 ", " 10       ");

        Trim subTri = new Trim();
        System.out.println(subTri.methTrim(point));
    }
}




