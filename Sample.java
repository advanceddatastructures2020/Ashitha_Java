import java.awt.*;
import java.applet.*;
/* <applet code="Sample" width=300 height=50>
</applet>   */
public class Sample extends Applet
{
    String msg;
//set the foreground and background colors.
public void init()
{
	setBackground(Color.cyan);
	setForeground(Color.red);
	msg = "Inside init() --";
}
}
