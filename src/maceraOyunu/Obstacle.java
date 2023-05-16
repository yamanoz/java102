package maceraOyunu;

import java.util.Random;
import java.util.Scanner;

public class Obstacle {
	Scanner scanner=new Scanner(System.in);
	Player player;
	Chracter charter;
	
	
Random random=new Random();
	
	private int id;
	private int damage;
	private int health;
	private String name;
	private int killvalue;
	private int obstacleNumber;  
	private BattleLoc battleLoc;
	
	
	
	public Obstacle(Player player, String name, int id, int damage, int health, int killvalue,
			int obstacleNumber) {
	
		this.player = player;
		this.id = id;
		this.damage = damage;
		this.health = health;
		this.name = name;
		this.killvalue = killvalue;
		this.obstacleNumber = obstacleNumber;
	}
	
	public void obstacleStats() {
		 System.out.println("Obstacle's name 🦇 :" + this.getName());
	        System.out.println("Obstacle's damage 👊 :" + this.getDamage());
	        System.out.println("Obstacle's health 🖤 :" + this.getHealth() );
	        if(!getName().equals("Snake🐍")){
	            System.out.println("If you kill you earn " + this.getKillvalue() + "💵");
	        }else System.out.println("If you are lucky🍀 you can get some stuff or items");
	}
	
	
	public void award() {
		int winsomething=random.nextInt(1,100);
		int winitem=random.nextInt(1,100);
		
		if(winsomething>=1&& winsomething<=45) {
			System.out.println("You didn't win an award");
		
		}
		else if(winsomething>45&&winsomething<=60) {
			if(winitem>=1&&winitem<=50) {
				System.out.println("Do you want Gun? press for Y or no for N");
				String yesorno=scanner.nextLine();
				yesorno=yesorno.toUpperCase();
				if(yesorno.equals("Y")) {
					getPlayer().Weapons(new Gun());
				}
				else {
					System.out.println("You dropped the item");
				}
			}
			else if(winitem>50&&winitem<=80) {
				System.out.println("Do you want Sword? press yes for Y no for N");
				String yesorno=scanner.nextLine();
				yesorno=yesorno.toUpperCase();
				if(yesorno.equals("Y")) {
					getPlayer().Weapons(new Sword());
					System.out.println("Your block"+this.getPlayer().getWeapon());
				}
				else {
					System.out.println("You dropped the item");
				}
			}
			else if(winitem>80&&winitem<=100) {
				System.out.println("Do you want Rifle? press yes for Y no for N");
				String yesorno=scanner.nextLine();
				yesorno=yesorno.toUpperCase();
				if(yesorno.equals("Y")) {
					getPlayer().Weapons(new Rifle());
					System.out.println("You take"+this.getPlayer().getWeapon());
				}
				else {
					System.out.println("You dropped the item");
				}
			}
			
		}
		else if(winsomething > 60 && winsomething <= 75){
            if(winitem >= 1 && winitem <= 50){
                System.out.println("Do you want Light Armor? press yes for Y or no for N Armor block is 1🛡 ");
                String yesorno = scanner.nextLine();
                yesorno = yesorno.toUpperCase();
                if(yesorno.equals("Y")){
                    getPlayer().Armors(new LightArmor());
                    System.out.println("You take" + this.getPlayer().getBlock());
                }else System.out.println("You dropped the item");
            }else if(winitem > 50 && winitem <= 80){
                System.out.println("Do you want Medium Armor? press yes for Y or no for N Armor block is 3🛡 ");
                String yesorno = scanner.nextLine();
                yesorno = yesorno.toUpperCase();
                if(yesorno.equals("Y")){
                    getPlayer().Armors(new MediumArmor());
                    System.out.println("You take" + this.getPlayer().getBlock());
                }else System.out.println("You dropped the item");
            }else if(winitem > 80 && winitem <= 100){
                System.out.println("Do you want Heavy Armor? press yes for Y or no for N " + " Armor block is 5🛡" );
                String yesorno = scanner.nextLine();
                yesorno = yesorno.toUpperCase();
                if(yesorno.equals("Y")){
                    getPlayer().Armors(new HeavyArmor());
                    System.out.println("You take" + this.getPlayer().getBlock());
                }else System.out.println("You dropped the item");
            }
		}
		else if(winsomething > 75 && winsomething <= 100){
            if(winitem >=1 && winitem <= 50){
                System.out.println("You earned 1 💵");
                getPlayer().setMoney(getPlayer().getMoney() + 1);
            }else if(winitem >50 && winitem <= 80){
                System.out.println("You earned 5 💵");
                getPlayer().setMoney(getPlayer().getMoney() + 5);
            }else if(winitem >80 && winitem <= 100){
                System.out.println("You earned 10 💵");
                getPlayer().setMoney(getPlayer().getMoney() + 10);
            }
        }
		
	}
	
	
	
	

	public Chracter getCharter() {
		return charter;
		
	}
	public void setCharter(Chracter charter) {
		this.charter = charter;
	}
	public Player getPlayer() {
		return player;
	}
	
	public void setPlayer(Player player) {
		this.player=player;
	}
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKillvalue() {
		return killvalue;
	}
	public void setKillvalue(int killvalue) {
		this.killvalue = killvalue;
	}
	public int getObstacleNumber() {
		return obstacleNumber;
	}
	public void setObstacleNumber(int obstacleNumber) {
		this.obstacleNumber = obstacleNumber;
	}
	
	
	public BattleLoc getBattleLoc() {
		return battleLoc;
	}
	public void setBattleLoc(BattleLoc battleLoc) {
		this.battleLoc=battleLoc;
	}
}
