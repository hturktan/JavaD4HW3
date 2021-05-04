package JavaD4HW3;

public class Game {
	private int id;
	private String name;
	private double gamePrice;
	
	public Game() {
		
	}

	public Game(int id, String name, double gamePrice) {
		super();
		this.id = id;
		this.name = name;
		this.gamePrice = gamePrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}
	
	
	
}
