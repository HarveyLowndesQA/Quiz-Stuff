
final class OuterClass {

	private int x = 50;
	
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.myMethod();
	}
	
	abstract class SomeClass {
		
		{
			x = 100;
		}
		
		SomeClass() {
			x = 30;
		}
		
	}
	
	class InnerClass extends SomeClass {
		
		private int x = 25;
		
		void myMethod() {
			
			int x = 10;

			new SomeClass() {
				OuterClass.Printable p = new OuterClass.Printable() {
					
					int x = 5;
					
					{
						this.x = 15;
					}
					
					@Override
					public Printable print(String message) {
						OuterClass.this.x = 10;
						System.out.println(message);
						return this;
					}
					
					
				}.print(Integer.toString(OuterClass.this.x));
				
			};
		}
	}
	
	
	interface Printable {
		
		Printable print(String message);
		
	}
	
}
