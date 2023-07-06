class BiCycle{
	String define_me(){
		return "a vehicel with pedals.";
	}
}

class MotorCycle extends BiCycle{
	@Override // Override annotation used to inherit the derived class from base class
	String define_me(){
		return "a cycle with an engine.";
	}
	MotorCycle(){
		System.out.println("Hello I had "+ define_me());
		String temp=super.define_me();
		System.out.println("I too had "+ temp );
	}
}
public class Solution{
	public static void main(String []args){
		MotorCycle M=new MotorCycle();
	}
}