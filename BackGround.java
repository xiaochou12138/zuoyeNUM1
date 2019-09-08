package company;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class BackGround {
    public void init(){

        this.setTitle("画图");

        this.setSize(1000,750);

        this.setLocation(600,300);

        addMouseListener(this);

        //关闭窗口退出进程

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        this.setVisible(true);

    }



    //鼠标响应函数



    public void mouseClicked(MouseEvent point) {

        int x = point.getX();

        int y = point.getY();

        Graphics g = this.getGraphics();

        panel.DrawRect(g,x,y,300,200,Color.BLUE);

        //用对象来设定setContentPane(panel);

    }

    public void mousePressed(MouseEvent e) {}

    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {}


    public void mouseExited(MouseEvent e) {}



    public BackGround(){

        super();

        init();
    }
    public static void main(String[] args){

        BackGround backGround = new BackGround();



    }
}
