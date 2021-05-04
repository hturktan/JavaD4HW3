package JavaD4HW3;

public class SellingGameManager implements SellingGameService{

	@Override
	public void sell(Game game, Player player) {
        System.out.println(game.getName() + " is added to account of " + player.getFirstName() + player.getLastName());
		
	}

}
