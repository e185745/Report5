package jp.ac.uryukyu.ie.e185745;

public class Enemy extends LivingThing {
    public Enemy(String name, int hitPoint, int attack, boolean dead){
        super(name ,hitPoint ,attack , dead);
    }
    @Override
    public void wounded(int damage){
        setHitPoint(damage);
        if( getHitPoint() < 0 ) {
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n", GetName());
        }
    }
}