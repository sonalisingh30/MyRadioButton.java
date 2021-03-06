import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ItemListener;
public class Myradiobutton extends Frame implements ItemListener {
    
    String msg="";
    CheckboxGroup cbg;
    Checkbox y,n;
     public  static void main(String args[])
    {
        Myradiobutton b=new Myradiobutton();
        b.setSize(450,450);
        b.setTitle("Radio Button");
        b.setVisible(true);
    }

     
    Myradiobutton()
    {
        setLayout(new FlowLayout());
        cbg= new CheckboxGroup();
        y= new Checkbox("right",cbg,true);
        n=new Checkbox("wrong",cbg,false);
        add(y);
        add(n);
        y.addItemListener(this);
        n.addItemListener(this);
         this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
   
   
        }

    @Override
    public void itemStateChanged(ItemEvent e) {
        repaint();
    }
    public void paint(Graphics g)
    {
        msg="Present status:";
        msg+=cbg.getSelectedCheckbox().getLabel();
        g.drawString(msg,15,120);
    }
     }
