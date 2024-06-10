package model;

import java.util.ArrayList;

public class Case {
    private ArrayList<Item> items;
    private boolean isWallN;
    private boolean isWallS;
    private boolean isWallE;
    private boolean isWallW;

    public Case(){
        this.items = new ArrayList<Item>();
        this.isWallN = false;
        this.isWallS = false;
        this.isWallE = false;
        this.isWallW = false;
    }

    public void addItem(Item item){
        this.items.add(item);
    }
    public void removeItem(Item item){
        this.items.remove(item);
    }
}
