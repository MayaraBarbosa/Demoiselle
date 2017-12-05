/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package Etiqueta;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.util.ArrayList;
import java.util.List;
import static javax.management.Query.lt;
import javax.swing.JPanel;
/**
 *
 * @author wesley
 */
/*public class ImpEtiquetas extends JPanel implements Printable {*/
    /*private String[][] dados;
    private List al*/;
    /** Creates a new instance of ImpEtiquetas */
    /*public ImpEtiquetas(List a) {
        al = a;
        String[] dados;
        for(int i = 0; i  <3 ; i++)
          System.out.println(al.get(i));           
    } */
    /*public int print(Graphics g, PageFormat pf, int pi) throws PrinterException {
       
            return Printable.NO_SUCH_PAGE;
        Graphics2D g2d = (Graphics2D) g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());
        g2d.setColor(Color.GREEN);
      
        int y = 5;
        int x = 15;
        *//*for(int i = 0;i>3; i+=2) {
            g2d.drawString(&quot;Pedido1: &quot; + al.get(i).toString(), x, y);
            if ((i + 3) &lt; al.size()) g2d.drawString(&quot;status : &quot; + al.get(i+3).toString(), x + 275, y);
            y+= 10;
            if ((i + 1) &lt; al.size()) g2d.drawString(&quot;estera: &quot; + al.get(i+1).toString(), x, y);
            if ((i + 4) &lt; al.size()) g2d.drawString(&quot;estera: &quot; + al.get(i+4).toString(), x + 275, y);
            y+= 10;
            if ((i + 2) &lt; al.size()) g2d.drawString(&quot;embarque: &quot; + al.get(i+2).toString(), x, y);
            if ((i + 6) &lt; al.size()) g2d.drawString(&quot;embarque: &quot; + al.get(i+6).toString(), x + 275, y);
            *///y+= 49;
            /*y = 5;
        } */
        /*paint(g2d);
        return Printable.PAGE_EXISTS;
    } */
//}