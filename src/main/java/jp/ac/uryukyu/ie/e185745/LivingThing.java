package jp.ac.uryukyu.ie.e185745;

public class LivingThing {
    private  String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing(String name, int hitPoint, int attack, boolean dead) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.attack = attack;
        this.dead = dead;
        dead = false;
    }


    public boolean isDead() { return dead;}

    public String getName(){
        return name;
    }

    public void attack(LivingThing opponent) {
        int damage = (int) (Math.random() * attack);
        if (!dead) {
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    public void wounded(int damage){
        hitPoint -= damage;

        if (hitPoint < 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

    public String GetName(){
        return this.name;
    }
    public void setHitPoint(int power){
        this.hitPoint -= power;
    }
    public int getHitPoint(){
        return  this.hitPoint;
    }
    public void setDead(boolean death){
        this.dead = death;
    }
}