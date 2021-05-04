package JavaD4HW3;

public class Main {

	public static void main(String[] args) {
		
		PlayerManager playerManager = new PlayerManager();
		Player player1 = new Player ();
		player1.setId(1);
		player1.setFirstName("Ahmet");
		player1.setLastName("Can");
		player1.setBirthOfYear(1982);
		player1.setNationalId("12345678901");
		
	PlayerCheckManager playerCheckManager = new PlayerCheckManager();
	playerCheckManager.checkPlayer(player1);
	
	playerManager.add(player1);
	
	GameManager gameManager = new GameManager();
	Game game1 = new Game();
	game1.setId(1);
	game1.setName("FM");
	game1.setGamePrice(249.90);

	SellingGameManager sellingGameManager = new SellingGameManager();
	sellingGameManager.sell(game1, player1);
	
	CampaignManager campaingManager = new CampaignManager();
	Campaign campaign = new Campaign();
	campaign.setName("Black Friday");
	campaign.setDiscountAmount(33);
	
	campaingManager.addCampaign(campaign);
	campaingManager.calculateDiscountCampaign(campaign, game1);

	}

}
