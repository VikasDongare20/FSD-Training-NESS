abstract class Game{
	public void Start(){
		System.out.println("Game is Started");
	}
	public void Stop() {
		System.out.println("Game is stopped");
	}
	abstract void play();
}
class Game1 extends Game{

	@Override
	void play() {
		// TODO Auto-generated method stub
		System.out.println("Games is playing");
		
	}
	
}
public class AbstractionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game1 g=new Game1();
		g.Start();
		g.Stop();
		g.play();

	}

}
