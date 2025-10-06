import java.applet.*;
import java.awt.*;
import java.awt.event.*;

// <Applet code =Calculator.class width=190 height=215>
// </Applet>

public class Calculator extends Applet implements ActionListener
{
   Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
   TextField t;
   Font f = new Font ("Times New Roman",Font.PLAIN, 18);
   StringBuffer str;
   double val;
   public void init()
 {
    this.setLayout(null);
    t=new TextField("0",12);
    t.setFont(f);

    b0=new Button("0");
    b1=new Button("1");
    b2=new Button("2");
    b3=new Button("3");
    b4=new Button("4");
    b5=new Button("5");
    b6=new Button("6");
    b7=new Button("7");
    b8=new Button("8");
    b9=new Button("9");
    b10=new Button(".");
    b11=new Button("=");
    b12=new Button("+");
    b13=new Button("-");
    b14=new Button("/");
    b15=new Button("*");
    b16=new Button("On/Off");
    b17=new Button("Ac");

    t.setBounds(25,5,135,25);
    b16.setBounds(25,35,65,30);
    b17.setBounds(95,35,65,30);
    b14.setBounds(130,35,65,30);
    b7.setBounds(25,70,30,30);
    b8.setBounds(60,70,30,30);
    b9.setBounds(95,70,30,30);
    b15.setBounds(130,70,30,30);
    b4.setBounds(25,105,30,30);
    b5.setBounds(60,105,30,30);
    b6.setBounds(95,105,30,30);
    b13.setBounds(130,105,30,30);
    b1.setBounds(25,140,30,30);
    b2.setBounds(60,140,30,30);
    b3.setBounds(95,140,30,30);
    b12.setBounds(130,140,30,30);
    b0.setBounds(25,175,30,30);
    b10.setBounds(60,175,30,30);
    b11.setBounds(95,175,30,30);

    this.add(t);
    this.add(b0);
    this.add(b1);
    this.add(b2);
    this.add(b3);
    this.add(b4);
    this.add(b5);
    this.add(b6);
    this.add(b7);
    this.add(b8);
    this.add(b9);
    this.add(b10);
    this.add(b11);
    this.add(b12);
    this.add(b13);
    this.add(b14);
    this.add(b15);
    this.add(b16);
    this.add(b17);

    b0.addActionListener(this);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b10.addActionListener(this);
    b11.addActionListener(this);
    b12.addActionListener(this);
    b13.addActionListener(this);
    b14.addActionListener(this);
    b15.addActionListener(this);
    b16.addActionListener(this);
    b17.addActionListener(this);

  }
   public void actionPerformed(ActionEvent e)
  {
    String st = t.getText();
    if (st.equals("0"))
        t.setText("");
        if(e.getSource()==b0)
        {
        t.setText(t.getText()+"0");
        }
        if(e.getSource()==b1)
        {
        t.setText(t.getText()+"1");
        }
        if(e.getSource()==b2)
        {
        t.setText(t.getText()+"2");
        }
        if(e.getSource()==b3)
        {
        t.setText(t.getText()+"3");
        }
        if(e.getSource()==b4)
        {
        t.setText(t.getText()+"4");
        }
        if(e.getSource()==b5)
        {
        t.setText(t.getText()+"5");
        }
        if(e.getSource()==b6)
        {
        t.setText(t.getText()+"6");
        }
        if(e.getSource()==b7)
        {
        t.setText(t.getText()+"7");
        }
        if(e.getSource()==b8)
        {
        t.setText(t.getText()+"8");
        }
        if(e.getSource()==b9)
        {
        t.setText(t.getText()+"9");
        }
        if(e.getSource()==b10)
        {
        t.setText(t.getText()+".");
        }
        if(e.getSource()==b11)
        {

        }
        if(e.getSource()==b12)
        {
            
        }
        if(e.getSource()==b13)
        {
            
        }
        if(e.getSource()==b14)
        {
            
        }
        if(e.getSource()==b15)
        {
            
        }
        if(e.getSource()==b16)
        {
           if(st.equals(""))
              t.setText("0");
              else
              t.setText(""); 
        }
        if(e.getSource()==b17)
        {
            
        }
    }

}


