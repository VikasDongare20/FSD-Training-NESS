 interface Game {
	
	void Start();
	void Stop();
	void Play();

}

class Game1 implements Game{

	@Override
	public void Start() {
		// TODO Auto-generated method stub
		System.out.println("Game1 is started");
	}

	@Override
	public void Stop() {
		// TODO Auto-generated method stub
		System.out.println("Game1 is stopped");
		
	}

	@Override
	public void Play() {
		// TODO Auto-generated method stub
		System.out.println("Game 1 is running");
		
	}
	
	
}
class Game2 implements Game{

	@Override
	public void Start() {
		// TODO Auto-generated method stub
		System.out.println("Game 2 is started");
		
	}

	@Override
	public void Stop() {
		// TODO Auto-generated method stub
		System.out.println("Game2 is Stopped");
		
	}

	@Override
	public void Play() {
		// TODO Auto-generated method stub
		System.out.println("Game 2 is running");
		
	}
	
}
	
	

public class InterfaceDemo3{
	public static void main(String[] args) {
		Game g1=new Game1();
		Game g2=new Game2();
		g1.Start();
		g1.Stop();
		g1.Play();
		g2.Start();
		g2.Stop();
		g2.Play();
		
	}
}
