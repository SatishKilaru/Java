class Bird {
	private String name;
	private int number;
    int i=2;
	Bird(String name)
	{
		this.name = name;
		number++;

	}

	public void fly()
	{
		System.out.println(
			"This bird flies");
	}

	public int getNumber()
	{
	    i+=1;
	    System.out.println(i);
		return number;
	}

	public String getName()
	{
		return name;
	}
}
class Main{
	public static void main(String args[])
	{
		Bird b1 = new Bird("Parrot");
		Bird b2 = new Bird("Sparrow");
		Bird b3 = new Bird("Pigeon");

		System.out.println(b3.getNumber());
	}
}

