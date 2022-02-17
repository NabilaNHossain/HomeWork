package hw11Q3Abstraction.copy.copy.copy;

public interface University extends Hospital, College {

	public void classSize();

	public void playGround();

	public void teacher();

	public default void gymnasium() {
	}

	public static void library() {
		System.out.println("This is from the static method of Univeristy class.");
	}

	@Override
	default void emergencyRoom() {
		System.out.println("This is printing from the emergencyRoom of Hospital.");
	}

	@Override
	default void surgeryRoom() {
		System.out.println("This is printing from the surgeryRoom of Hospital.");
	}

	@Override
	default void cafeteria() {
		System.out.println("This is printing from the cafeteria of Hospital.");
	}

	@Override
	default void morgue() {
		System.out.println("This is printing from the morgue of Hospital.");
	}

	@Override
	default void commonRoom() {
		System.out.println("This is printing from commonRoom of the College class.");
	}

	@Override
	default void laboratory() {
		System.out.println("This is printing from laboratory of the College class.");
	}

	@Override
	default void languageClub() {
		System.out.println("This is printing from languageClub of the College class.");
	}

	@Override
	default void dorm() {
		System.out.println("This is printing from dorm of the College class.");
	}

}