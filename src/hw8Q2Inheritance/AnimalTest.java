package hw8Q2Inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.animalInfo();
		System.out.println("----------------------------");
		Mammal mammal = new Mammal();
		mammal.mammalInfo();
		mammal.animalInfo();
		System.out.println("-----------------------------");
		Reptile reptile = new Reptile();
		reptile.reptileInfo();
		reptile.animalInfo();
		System.out.println("-----------------------------");
		Birds birds = new Birds();
		birds.birdsInfo();
		birds.animalInfo();
		System.out.println("-----------------------------");
		Dog dog = new Dog();
		dog.dogInfo();
		dog.mammalInfo();
		dog.animalInfo();
		System.out.println("-----------------------------");
		Snake snake = new Snake();
		snake.snakeInfo();
		snake.reptileInfo();
		snake.animalInfo();
		System.out.println("-----------------------------");
		Robin robin = new Robin();
		robin.robinInfo();
		robin.birdsInfo();
		robin.animalInfo();
		System.out.println("-----------------------------");
		BullDog bullDog = new BullDog();
		bullDog.bullDogInfo();
		bullDog.dogInfo();
		bullDog.mammalInfo();
		bullDog.animalInfo();
		System.out.println("-----------------------------");
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
	}
//Cobra extends Snake,Snake extends Reptile,Reptile extends Animal is an example of multi-level inheritance
//Mammal extends Animal,Reptile extends Animal,Birds extends Animal -these are examples of hierarchical inheritance
}
