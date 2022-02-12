package hw10Q3Abstraction.copy.copy;

public interface University extends Hospital, College {
	/*
	 * Only one keyword "extends" is used for the inheritance in Java.Interface can
	 * inherit more than one interfaces by the word "extends", but cannot inherit a
	 * regular or abstract class by neither "extends" nor "implements"
	 * keyword.Interface can do more than one inheritance.
	 */
	public void classSize();

	public void playGround();

	public void teacher();

	public default void gymnasium() {
	}

	public static void library() {
	}
}