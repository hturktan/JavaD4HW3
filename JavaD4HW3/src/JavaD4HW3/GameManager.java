package JavaD4HW3;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
        System.out.println(game.getName() + " is added to game database");
		
	}

	@Override
	public void update(Game game) {
        System.out.println(game.getName() + " is updated into game database");
		
	}

	@Override
	public void delete(Game game) {
        System.out.println(game.getName() + " is deleted from game database");
		
	}

}
