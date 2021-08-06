abstract class Inner{
	public abstract void method();
}
public class AnnonymousInnerClass {
	public static void main(String[] args) {
		Inner I = new Inner() {
			public void method() {
				System.out.println("you are in annonymous inner class");
			}
		};
		I.method();
	}

}
