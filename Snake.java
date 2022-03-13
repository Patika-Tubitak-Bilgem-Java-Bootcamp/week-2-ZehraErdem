public class Snake extends Obstacle{
    public Snake() {
        super(4, "Yılan", 0,12,0);

        setDamage((int) Math.random()*4 + 3);
    }
}
