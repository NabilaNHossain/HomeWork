package hw5Q2Constructor;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer = new Computer(); 
		Computer computer2 = new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, 'A', false);
		Computer computer3 = new Computer("Windows", "Lenovo", "Windows10", 1000, 'B', true);
	}

}
