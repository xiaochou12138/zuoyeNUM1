package company;
import java.awt.*;

public class Panel {
    private BackGround backGround;

    public Panel(BackGround backGround) {

        super();

        this.backGround = backGround;

    }

    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
    }
    DrawRect(g,0,0,100,100,Color.BLUE);



    public void DrawRect(Graphics graphics,int x,int y,int width,int height,Color color){

        graphics.drawRect(x,y,width,height);

        graphics.setColor(color);

        graphics.fillRect(x,y,width,height);

    }
}
