package edu.chalmers_gu_cse.oopd.exercises.polygonModel;

import edu.chalmers_gu_cse.oopd.exercises.polygonModel.polygon.IPolygon;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/* package-private */ class PolygonSet extends JComponent {
    private List<IPolygon> polygons = new ArrayList<>();
    public void addPolygon(IPolygon p){
        polygons.add(p);
    }

    public void paint(Graphics g){
        for (IPolygon polygon : polygons) {
            polygon.paint(g);
        }
    }

    public void translate(int x, int y){
        /* Vår gamla kod, med muterbara shapes
        for (IPolygon p : polygons) {
            p.translate(x,y);
        }
         */
        // Vår nya kod, som använder mutate-by-copy
        List<IPolygon> translated = new ArrayList<>();
        for (IPolygon p : polygons) {
            IPolygon q = p.translate(x,y);
            translated.add(q);
        }
        this.polygons = translated;
    }
}
