
    import java.awt.*;

    public class Predator {

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

        public Predator () {
            hitbox = new Rectangle(xpos, ypos, width, height);

        }

        public Predator (int paramXpos, int paramYpos,
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

        public void wrap(){
            xpos = xpos + dx;
            ypos = ypos + dy;

            if (ypos == 700-height || ypos==0) {
                dy=-dy;
            }

            if (xpos >= 1000-width+100) {
                xpos = -width;
            }

            hitbox = new Rectangle(xpos, ypos, width, height);
        }

        public void PrintInfo (){
            System.out.println(name + " is at (" + xpos + ", " + ypos + ")" );
        }
    }
