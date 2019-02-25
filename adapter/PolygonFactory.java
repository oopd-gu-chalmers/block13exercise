package adapter;

import shapes.*;
/**
 * Created by Niklas on 2016-02-19.
 */
public class PolygonFactory {
    public static IPolygon createRectangle(int x, int y){
        return new PolygonWrapper(new Rectangle(x,y,4,2));
    }
    public static IPolygon createTriangle(int x, int y){ return new PolygonWrapper(new Triangle(x,y,2,2)); }
    public static IPolygon createSquare(int x, int y){ return new PolygonWrapper(new Rectangle(x,y,2,2)); }
}
