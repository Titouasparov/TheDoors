package model;

public abstract class Entity {
    Case position;
    int health;
    String skinBody;

    public Entity(Case position, int health, String skinBody) {
        this.position = position;
        this.health = health;
        this.skinBody = skinBody;
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public abstract void move (Direction direction);
}
