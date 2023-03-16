import java.rmi.MarshalException;

public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maksWeight;

    Match(Fighter f1,Fighter f2,int minWeight,int maksWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maksWeight=maksWeight;
    }

    boolean isCheck(){
        return (this.f1.weight>=minWeight && this.f1.weight<=maksWeight && this.f2.weight>=minWeight && this.f2.weight<=maksWeight);
    }

    public void run(){
        System.out.println("\nDovuscu Bilgileri\n------------------");
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println();

        if(isCheck()){
            while (this.f1.health>0 && this.f2.health>0){
                if (whoStart()){
                f2.turn(f1);
                if (isWin())
                    break;
                f1.turn(f2);
                if(isWin())
                    break;
                }
                else {
                    f1.turn(f2);
                    if(isWin())
                        break;
                    f2.turn(f1);
                    if (isWin())
                        break;


                }

                System.out.println("f1 saglık = "+f1.health);
                System.out.println("f2 saglık = "+f2.health);

                System.out.println("------------");
            }

        }else {
            System.out.println("Sporcularin siklet farki var!");
        }



    }

    boolean isWin(){
        if(f1.health==0){
            System.out.println(f2.name + "kazandi!");
            return true;
        }else if(f2.health==0){
            System.out.println(f1.name+" kazandi!");
            return true;
        }else {
            return false;
        }
    }

    boolean whoStart(){
        double win=Math.random()*100;
        if(win<50){
            return true;
        }
        else {
            return false;
        }
    }
}
