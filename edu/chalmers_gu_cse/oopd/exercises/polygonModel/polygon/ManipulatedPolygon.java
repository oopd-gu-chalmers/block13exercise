package edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon;

import java.awt.*;
import java.util.List;

public abstract class ManipulatedPolygon extends AbstractPolygon {
    private AbstractPolygon base;

    protected ManipulatedPolygon(AbstractPolygon base){
        this.base = base;
    }

    @Override
    public Point getCenterPoint() {
        return base.getCenterPoint();
    }

    // TODO: For a challenge, how can we avoid the casts in these
    //       three method implementations? Hint: covariance...
    @Override
    public Polygon translate(int x, int y) {
        setBasePolygon( (AbstractPolygon) base.translate(x, y));
        return this;
    }
    @Override
    public Polygon rotate(double radians) {
        setBasePolygon( (AbstractPolygon) base.rotate(radians));
        return this;
    }
    @Override
    public Polygon scale(double x, double y) {
        setBasePolygon( (AbstractPolygon) base.scale(x, y));
        return this;
     }

    // This method, together with manipulatePoint, forms
    // a Template Method Pattern. This is the template method in question.
    @Override
    protected List<Point> getPoints() {
        List<Point> points = base.getPoints();
        Point center = getCenterPoint();
        for (Point p : points){
            manipulatePoint(center, p);
        }
        return points;
    }

    // The core of our new model for polygons, where each kind of
    // manipulation is handled by a different class, which implements
    // the following method.
    // This represents the "hole" in the template that is getPoints, that
    // we expect subclasses to fill with their own behavior.
    protected abstract void manipulatePoint(Point center, Point p);

    protected void setBasePolygon(AbstractPolygon base){
        this.base = base;
    }
}
