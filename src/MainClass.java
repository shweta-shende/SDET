
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a=new Animal();
		a.animalSound();
		Animal p=new Pig();
		p.animalSound();
		Animal d=new Dog();
		d.animalSound();

	}

}
class Animal
{
	public void animalSound()
	{
		System.out.println("animal makes a sound");
	}

	public void AnimalSound() {
		// TODO Auto-generated method stub
		
	}
}
class Pig extends Animal
{
	@Override
	public void AnimalSound()
	{
		System.out.println("pig says: wee wee");
	}
	}
class Dog extends Animal
{
	@Override
	public void AnimalSound()
	{
		System.out.println("dog says: bho bho");
	}
}
