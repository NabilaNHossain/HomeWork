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
		/*An example of Hierarchical Inheritance is Mammal class extends to Animal class,Reptile class extends to Animal class,Birds class extends to Animal class.More than one class is derived from one single Parent/Base class.*/
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
		/*Cobra class extends to Snake class,Snake class extends to Reptile class, Reptile class extends to Animal class is an example of Multi-Level Inheritance. Because Cobra is derived from another derived class Snake.Similarly,Snake class is derived from another derived class Reptile,and Reptile class is derived from Animal class */
		Cobra cobra = new Cobra();
		cobra.cobraInfo();
		cobra.snakeInfo();
		cobra.reptileInfo();
		cobra.animalInfo();
	}

}
