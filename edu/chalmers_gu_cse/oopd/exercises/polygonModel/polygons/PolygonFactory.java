package edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygons;

/**
 * Created by Niklas on 2016-02-19.
 */
public class PolygonFactory {

    public static IPolygon createTriangle(int x, int y){
        return new Triangle(x,y);
    }
    public static IPolygon createRectangle(int x, int y) { return new Rectangle(x,y); }
    public static IPolygon createSquare(int x, int y) { return new Square(x,y); }

}
