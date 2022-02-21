package edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon;

import javax.swing.*;
import java.awt.*;
import java.util.List;

/**
 * Created by Niklas on 2016-02-29.
 */
abstract class AbstractPolygon extends JComponent implements IPolygon {
    // This violates MVC - we want this code to be part of the view2d packages!
    // We still don't have the knowledge to fix it though, so be patient.
    public void paint(Graphics g){
        java.util.List<Point> corners = getPoints();
        // first and last point should be the same
        corners.add(corners.get(0));
        Point from = null;
        for (Point to : corners){
            if (from != null){
                g.drawLine(from.x, from.y, to.x, to.y);
            }
            from = to;
        }
    }

    // Here's is a method, which, together with manipulatePoint, forms
    // a Template Method Pattern. This is the template method in question.
    protected List<Point> getPointsWithBase(AbstractPolygon base) {
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
    // This represents the "hole" in the template, that
    // we expect subclasses to fill with their own behavior.
    protected abstract void manipulatePoint(Point center, Point p);

    protected abstract List<Point> getPoints();

}
