package maceraOyunu;

public class Base extends NormalLoc {
    public Base(Player player){
        super(player, "Safe house");
       if(getPlayer().getCharName().equals("Samurai")){
           getPlayer().setHealth(21);
       }
       else if(getPlayer().getCharName().equals("Archer")){
           getPlayer().setHealth(18);
       }
       else if(getPlayer().getCharName().equals("Knight")){
           getPlayer().setHealth(24);
       }
    }

    @Override
    public boolean onLocation() {
        return true;
    }
}