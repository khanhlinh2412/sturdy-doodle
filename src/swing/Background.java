/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.GeneralPath;
import javax.swing.JPanel;

/**
 *
 * @author sethk
 */
public class Background extends JPanel {

    private float animate;
    private boolean showPaint;

    public boolean isShowPaint() {
        return showPaint;
    }

    public void setShowPaint(boolean showPaint) {
        this.showPaint = showPaint;
    }

    public float getAnimate() {
        return animate;
    }

    public void setAnimate(float animate) {
        this.animate = animate;
        repaint();
    }

    private float easeOutQuint(float x) {
        return (float) (1 - Math.pow(1 - x, 5));
    }

    private float easeInOutCirc(float x) {
        double v = x < 0.5
                ? (1 - Math.sqrt(1 - Math.pow(2 * x, 2))) / 2
                : (Math.sqrt(1 - Math.pow(-2 * x + 2, 2)) + 1) / 2;
        return (float) v;
    }

    public Background() {
        setOpaque(false);
    }

    @Override
    public void paint(Graphics grphcs) {
        if (!showPaint) {
            super.paint(grphcs);
        }
        Graphics2D g2 = (Graphics2D) grphcs.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int height = (int) (getHeight() * (1f - easeOutQuint(animate)));
        g2.setColor(new Color(207, 235, 247));
        g2.fill(createShape(height, 90, 70, 90, 115, 80, 60, 95));
        g2.setColor(new Color(50, 169, 217));
        g2.fill(createShape(height, 60, 50, 100, 70, 50, 90, 50));
        g2.setColor(new Color(0, 147, 207));
        g2.fill(createShape(height, 70, 40, 60, 35, 70, 45, 70));
        int bgheight = (int) (getHeight() * (1f - easeInOutCirc(animate)));
        g2.setColor(new Color(245, 245, 245));
        g2.fillRect(0, bgheight, getWidth(), getHeight());
        g2.dispose();
        if (showPaint) {
            super.paint(grphcs);
        }
    }

    private Shape createShape(int location, int startInit, int... points) {
        int width = getWidth();
        int height = getHeight();

        int ss = width / points.length;
        int size = location;
        GeneralPath p = new GeneralPath();
        int space = 0;
        int xs = 0;
        int ys = location - startInit;
        for (int point : points) {
            point = size - point;
            int s = space + ss / 2;
            p.append(new CubicCurve2D.Double(xs, ys, xs, ys, xs, ys, xs, ys), true);
            space += ss;
            xs += ss;
            ys = point;

        }
        p.lineTo(width, ys);
        p.lineTo(width, height);
        p.lineTo(0, height);

        return p;
    }
}
