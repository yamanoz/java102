package maceraOyunu;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Player {

	private Scanner input=new Scanner(System.in);
	
	
	private int block;
	private int damage;
	private int health;
	private int money;
	private String Weapon;
	private String charName;
	private String playerName;
	
	Inventory inventory=new Inventory(false,false,false,this.getWeapon(),"",3,5);
	
	

	public int getBlock() {
		return block;
	}

	public void setBlock(int block) {
		this.block = block;
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

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getWeapon() {
		return Weapon;
	}

	public void setWeapon(String weapon) {
		Weapon = weapon;
	}

	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}

	public Player(String playerName) {
		this.playerName=playerName;
		
	}
	
	public void selectChar() {
		Chracter[] charList = {new Samurai(), new Archer(), new Knight()};
		System.out.println("Lütfen Karakterinizi Seçin !!!");
		for(Chracter character : charList) {
			System.out.println("Character's name🪪  :" + character.getName() + ", Damage🗡️ :" + character.getDamage() + ", Health💖 :" + character.getHealth() + ",Money💵 :" + character.getMoney() + " Weapon🗡: " + character.getWeapon());
		      
		}
		System.out.println("Please Choose a valid Characted");
		int deger=input.nextInt();
		switch(deger) {
		case 1:
			System.out.println("Samurai Choosed");
			gameChar(new Samurai());
			break;
		case 2:
			System.out.println("Archer Choosed");
			gameChar(new Archer());
			break;
		case 3:
			System.out.println("Knight Choosed");
		    gameChar(new Knight());
		    break;
		  default:
		    	System.out.println("Random Character is Choosing !!!");
		    	Random random=new Random();
		    	int rd=random.nextInt(3);
		    	switch(rd) {
		    	case 1:
                    System.out.println("Samurai Choosed");
                    gameChar(new Samurai());
                    break;
                case 2:
                    System.out.println("Archer Choosed");
                    gameChar(new Archer());
                    break;
                case 3:
                    System.out.println("Knight Choosed");
                    gameChar(new Knight());
                    break;
		    	}
		
		}
	}
	
	
	public void gameChar(Chracter character) {
        this.setDamage(character.getDamage());
        this.setHealth(character.getHealth());
        this.setMoney(character.getMoney());
        this.setCharName(character.getName());
        this.setBlock(character.getBlock());
        this.setWeapon(character.getWeapon());
    }
	  public boolean weaponChoose(Weapons weapons) {
	        this.setDamage(getDamage() + weapons.getDamage());
	        this.setMoney(getMoney() - weapons.getMoney());
	        this.setWeapon(weapons.getWeaponName());
	        return false;
	    }
	    public boolean Weapons(Weapons weapons) {
	        this.setDamage(getDamage() + weapons.getDamage());
	        this.setWeapon(weapons.getWeaponName());
	        return false;
	    }
	    public void Armors(Armors armors) {
	        this.setBlock(armors.getBlock());
	    }
	    
	    public void printPlayerInfo() {
	        System.out.println(getPlayerName() + "'s infos");
	        System.out.println("Money💵: " + getMoney() + "\n" + "Damage🗡️: " + getDamage() + "\n" + "Block🛡️:" + getBlock() + "\n" + "Health💖: " + getHealth() + "\n" + "Weapon⚔: " + getWeapon());
	    }

	    public void armorChoose(Armors armors) {

	        this.setMoney(getMoney() - armors.getMoney());
	        this.setBlock(armors.getBlock());
	        System.out.println("Your money amount💵:" + this.getMoney());
	    }
}
