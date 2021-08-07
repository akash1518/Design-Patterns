public class Main {
	  
	  public static void main (String[] args) {
			Duck duck = new BabuDuck();
			duck.setFlyBehaviour(new FlyWithWings());
			duck.setQuackBehaviour(new QuackQuack());
			duck.fly();
			duck.quack();
	  }
}
