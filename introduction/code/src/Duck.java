public abstract class Duck {
	  FlyBehaviour flyBehaviour;
	  QuackBehaviour quackBehaviour;
	  
	  
	  void fly(){
	  	  flyBehaviour.fly();
	  }
	  void quack(){
	  	  quackBehaviour.quack();
	  }
	  void eat(){
			System.out.println("Eating");
	  }
	  
	  public FlyBehaviour getFlyBehaviour () {
			return flyBehaviour;
	  }
	  
	  public void setFlyBehaviour (FlyBehaviour flyBehaviour) {
			this.flyBehaviour = flyBehaviour;
	  }
	  
	  public QuackBehaviour getQuackBehaviour () {
			return quackBehaviour;
	  }
	  
	  public void setQuackBehaviour (QuackBehaviour quackBehaviour) {
			this.quackBehaviour = quackBehaviour;
	  }
}
