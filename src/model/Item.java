package model;

public abstract class Item {
    String texture;
    Boolean isVisible;

    public abstract void trigger();
    public abstract void setIsVisible(Boolean isVisible);
}
