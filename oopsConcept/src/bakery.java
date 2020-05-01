class bakery extends cafe{
	//parent class for cake and cupcake
	public void eat(){
		System.out.println("Tooo sweet");
	}

	//implementation
	//fixing the abstract class

	//same method differnt class
	@Override
	public void music() {
		System.out.println("Soothing music");

	}
}