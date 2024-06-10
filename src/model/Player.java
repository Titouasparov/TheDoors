package model;

public class Player extends Entity {
    private String skinHat;

    public Player(Case position, int health, String skinBody) {
        super(position, health, skinBody);
    }

    @Override
    public void move(Direction direction) {

    }
}
