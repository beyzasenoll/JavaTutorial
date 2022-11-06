package Tatemi;

public  abstract class Ninja {

    public String name;
    private int hitPoint=100;
    private int lifePoint=100;
    private WeaponBehavior weapon

    public Ninja(String name){
        this.name=name;

    }
    public abstract void Attack(Ninja a);
}
