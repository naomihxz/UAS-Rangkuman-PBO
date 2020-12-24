package com.company;

class Player{
    String name;

    Player(String name){
        this.name = name;
    }
}

class Demon{
    int strength;

    Demon(int strength){
        this.strength = strength;
    }
}

class ContohGenerics<T>{
    T obj;

    public ContohGenerics(T obj){
        this.obj = obj;
    }

    public void displayType(){
        System.out.println(obj.getClass());
    }

    public static void main(String[] args) {
        Player p = new Player("player1");
        ContohGenerics <Player> cg1 = new ContohGenerics<>(p);
        cg1.displayType();

        Demon d = new Demon(90);
        ContohGenerics <Demon> cg2 = new ContohGenerics<>(d);
        cg2.displayType();
    }
}
