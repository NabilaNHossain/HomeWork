package hw10Q3Abstraction.copy.copy;
   
public interface University extends Hospital, College {
	/*
	 * University Interface extends to Hospital and College interface by using the
	 * keyword extends. .However,an Interface cannot inherit a regular or abstract
	 * class.One interface can inherit more than one Interfaces
	 */
	public void classSize();

	public void playGround();

	public void teacher();

	public default void gymnasium() {
	}

	public static void library() {
	}
}
