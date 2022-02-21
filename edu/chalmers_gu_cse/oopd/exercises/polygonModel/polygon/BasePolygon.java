package edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Niklas on 2016-02-28.
 */
class BasePolygon extends AbstractPolygon implements IPolygon {
    /*
       Invariant: the value stored for centerPoint must at all
       times be consistent with what calculateCenterPoint(points)
       would return. We only pre-calculate it as a caching
       optimization, so if the points attribute is updated,
       centerPoint must be recalculated.
     */
    private final Point centerPoint;
    private final List<Point> points;

    protected BasePolygon(List<Point> points){
        // defensive (deep) copying before storing away the list
        this.points = defensiveCopyPointList(points);
        // calculate and cache the centerPoint value
        centerPoint = calculateCenterPoint(this.points);
    }

    @Override
    public IPolygon translate(int x, int y) {
        // TODO: This is for you to implement
        return null;
    }
    @Override
    public IPolygon rotate(double radians) {
        // TODO: This is for you to implement
        return null;
    }
    @Override
    public IPolygon scale(double x, double y) {
        // TODO: This is for you to implement
        return null;
    }

    @Override
    public List<Point> getPoints() {
        // defensive copying of every point in list before
        // handing them out to a calling client
        return defensiveCopyPointList(this.points);
    }

    @Override
    // Fill the hole in getPointsWithBase from the superclass
    protected void manipulatePoint(Point center, Point p) {
        // In BasePolygon, we don't do manipulations,
        // that's kind of the whole point.
    }

    @Override
    public Point getCenterPoint() {
        // defensive copying before handing it out
        return new Point(centerPoint);
    }


    /* Simple static helper functions */
    // defensive copying of all points in a list
    private static List<Point> defensiveCopyPointList(List<Point> points) {
        List<Point> newList = new LinkedList<>();
        for (Point point : points){
            newList.add(new Point(point));
        }
        return newList;
    }
    // Calculating the center from a set of points.
    private static Point calculateCenterPoint(List<Point> points){
        int maxX = points.get(0).x, minX = points.get(0).x, maxY = points.get(0).y, minY = points.get(0).y;
        for (Point point : points) {
            maxX = Math.max(point.x, maxX);
            minX = Math.min(point.x, minX);
            maxY = Math.max(point.y, maxY);
            minY = Math.min(point.y, minY);
        }
        return new Point((maxX-minX)/2 + minX, (maxY-minY)/2 + minY);
    }


}
