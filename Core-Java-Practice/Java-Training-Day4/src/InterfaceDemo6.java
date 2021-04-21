interface GameG{
	void start();
	void stop();
	default void run() {
		System.out.println("Game is running");
	};
}

class GameG1 implements GameG{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Game1 is Started");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Game1 is stopped");
		
	}
	
}
class GameG2 implements GameG{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Game2 is started");
		
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Game2 is stopped");
		
	}
	
}
public class InterfaceDemo6 {
	public static void main(String[] args) {
		GameG g1=new GameG1();
		GameG g2=new GameG2();
		g1.start();
		g1.run();
		g1.stop();
		g1.start();
		g2.run();
		g2.stop();
		
	}

}
