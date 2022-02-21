package edu.chalmers_gu_cse.oopd.exercises.polygonModel;

import edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.IPolygon;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/* package-private */ class PolygonSet extends JComponent {
    private final List<IPolygon> polygons = new ArrayList<>();
    public void addPolygon(IPolygon p){
        polygons.add(p);
    }

    public void paint(Graphics g){
        for (IPolygon polygon : polygons) {
            polygon.paint(g);
        }
    }

    public void translate(int x, int y){
        for (IPolygon p: polygons){
            // This still violates Law of Demeter!
            // We don't want the extra dependency on Point!!
            p.translate(x,y);
        }

    }

}
