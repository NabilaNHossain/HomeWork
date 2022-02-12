package hw9Q3Abstraction.copy;

public interface University extends Hospital, College {
	/*
	 * One keyword is used for the inheritance in Interface. University Interface
	 * extends to Hospital and College interface by using the keyword
	 * extends.However,an Interface cannot inherit a Regular or an Abstract
	 * class.More than one inheritance is possible.
	 */
	public void classSize();

	public void playGround();

	public void teacher();

	public default void gymnasium() {
	}

	public static void library() {
	}
}
