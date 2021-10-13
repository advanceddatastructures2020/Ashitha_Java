import java.applet.*;
import java.awt.*;
import java.net.*;
/*  <applet code = "Simple.class" width=400 height=400>
</applet>  */
public class Simple extends Applet
{
public void init()
{
setBackground(Color.cyan);
setForeground(Color.red);
}
public void paint(Graphics g)
{
g.drawString("A SIMPLE APPLET", 100, 200);
}
}

