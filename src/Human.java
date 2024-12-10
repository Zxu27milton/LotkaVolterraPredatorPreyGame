import java.awt.*;

public class Human {

    public String name;
    public Image pic;
    public int xpos;
    public int ypos;
    public int dx;
    public int dy;
    public int width;
    public int height;
    public boolean isAlive;
    public Rectangle hitbox;

    public Human () {
        hitbox = new Rectangle(xpos, ypos, width, height);

    }

    public Human (int paramXpos, int paramYpos,
                 int paramDx, int paramDy,
                 int paramWidth, int paramHeight) {
        xpos = paramXpos;
        ypos =  paramYpos ;
        dx = paramDx;
        dy = paramDy;
        width = paramWidth;
        height = paramHeight;
        hitbox = new Rectangle(xpos, ypos, width, height);

    }

    public void move (){
        xpos = xpos + dx;
        ypos = ypos + dy;

        if (ypos == 700-height || ypos==0) {
            dy=-dy;
        }

        if (xpos == 1000-width || xpos==0) {
            dx=-dx;
        }

        hitbox = new Rectangle(xpos, ypos, width, height);

    }

    public void PrintInfo (){
        System.out.println(name + " is at (" + xpos + ", " + ypos + ")" );
    }
}
