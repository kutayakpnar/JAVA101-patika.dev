import java.util.Random;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodgePoss;

    Fighter(String name, int damage,int health,int weight,int dodgePoss){
        this.name=name;
        this.damage=damage;
        this.health=health;
        this.weight=weight;
        this.dodgePoss=dodgePoss;

    }
    int hit(Fighter foe){
        System.out.println(this.name+"-------->"+foe.name+" "+this.damage+ "damage hit.");
        if(foe.isDodge()){
            System.out.println(foe.name+ " DODGE THE PUNCH!");
            return foe.health;
        }
        if(foe.health-this.damage<=0){
            return 0;
        }

        return foe.health-this.damage;



    }
    boolean isDodge(){
        double randomNumber=Math.random()*100;
        return randomNumber<=this.dodgePoss;

    }
}
