package maceraOyunu;

public abstract class Chracter {
	private int id;
	private String name;
	private int damage;
	private int health;
	private int money;
	private int block;
	private String weapon;
	
	
	
	
	
	
	public Chracter(String name, int damage,int health, int money ,int block,String weapon) {
	
		this.name=name;
		this.damage = damage;
		this.health = health;
		this.money = money;
		this.block=block;
		this.weapon=weapon;
	}
	
	
	public int getBlock() {
		return block;
	}



	public void setBlock(int block) {
		this.block = block;
	}



	public String getWeapon() {
		return weapon;
	}



	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}



	
	
	



	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
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
	
	

}
