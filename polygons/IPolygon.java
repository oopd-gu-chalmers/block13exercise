package polygons;

import java.awt.*;

/**
 * Created by Niklas on 2016-02-19.
 */
public interface IPolygon {
    public void paint(Graphics g);
    public void updateCenter(int newX, int newY);
    public Point getCenter();
}
