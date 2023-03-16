public class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    int dodge;
    int brek;
    int heal;
    int critical;


    Fighter(String name,int damage,int health,int weight,int dodge,int brek,int heal,int critical){
        this.name=name;
        this.health=health;
        this.weight=weight;
        this.damage=damage;
        this.dodge=dodge;
        this.brek=brek;
        this.heal=heal;
        this.critical=critical;
    }


    public void turn(Fighter foe){


        if(isBreak()){
            this.health+=heal;
            System.out.println(this.name + "mola aldi, Saglik => "+this.health);

        }else if (foe.isDodge()){
            System.out.println(this.name +"vuruyor " +foe.name +" den blok geldi!");
        }else if(isCritic()){
            foe.health-=(int) damage +damage*(0.5);
            System.out.println("KRİTİK VURUŞŞ!!");
            System.out.println(this.name +"=>"+ foe.name+" "+(this.damage+ damage*(0.5))+" kadar hasar vurdu");

        }else {
            foe.health-=damage;
            System.out.println(this.name +"=>"+ foe.name+" "+this.damage+" kadar hasar vurdu");
        }

        if(foe.health-this.damage<0){
            foe.health=0;
        }

    }

    boolean isDodge(){
        double dodge=Math.random()*100;
        if (dodge<=this.dodge){
            return true;
        }else {
            return false;
        }
    }

    boolean isBreak(){
        double brek=Math.random()*100;
        if (brek<=this.brek){
            return true;
        }else {
            return false;
        }

    }

    boolean isCritic(){
        double critic=Math.random()*100;
        if (critic<=this.critical){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "Fighter{" +
                "name='" + name + '\'' +
                ", damage=" + damage +
                ", health=" + health +
                ", weight=" + weight +
                ", dodge=" + dodge +
                ", brek=" + brek +
                ", heal=" + heal +
                ", critical=" + critical +
                '}';
    }
}
