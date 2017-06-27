

public class OuterClass2 {
	
	protected class InnerClass {

		public void method() {
			
			abstract class NewClass {
				abstract void sayHello();
			}
			
			NewClass nc = new NewClass() {

				@Override
				void sayHello() {
					// TODO Auto-generated method stub
					
				}
				
			};
		}
		
	}

}
