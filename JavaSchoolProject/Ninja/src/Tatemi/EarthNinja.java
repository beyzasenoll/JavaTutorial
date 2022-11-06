package Tatemi;

import java.util.Random;

public abstract class EarthNinja extends Ninja {
    public EarthNinja{
        super("RED_EarthNinja");
    }

    @Override
    public void Attack(Ninja a){
        Random r=new Random();
        if(r.nextDouble()>0.5){
            getWeapon().useWeapon();
            (a.getLifePoint()-getWeapon().getHitpoint());
        }
        else{
            System.out.println("Not a succesful attack by "+getName());
        }
    }
}

