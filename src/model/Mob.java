package model;

public class Mob extends Entity {
    private float speed;
    private int damage;

    public Mob(Case position, int health, String skinBody) {
        super(position, health, skinBody);
    }

    @Override
    public void move(Direction direction) {
        // TODO Auto-generated method stub
    }
}
