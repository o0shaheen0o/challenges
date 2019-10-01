
public class OverRideEqual {

	int a;;
	String b;

	public static void main(String[] args) {
		
		OverRideEqual overRideEqual1 = new OverRideEqual(10, "mohamed");
		OverRideEqual overRideEqual2 = new OverRideEqual(10, "mohamed");
		System.out.println(overRideEqual1.equals(overRideEqual2));
		System.out.println(overRideEqual1.hashCode()== overRideEqual2.hashCode());
		System.out.println(overRideEqual1.toString());
		
	}
	
	public  OverRideEqual(int a,String b) {
		this.a=a;
		this.b=b;
	}

	@Override
	public String toString() {
		return Integer.toString(a)+ " " + this.b;
	}

	@Override 
	public boolean equals(Object obj)
	{
		
		OverRideEqual o; 
		if (! (obj instanceof OverRideEqual))
		{
			
			return false;
		}
		else 
		{
			o= (OverRideEqual)obj;
		}
		
		if (this.a==o.a && this.b.equals(o.b))
		{
			return true;

		}
		else 
		{
			return false;
		}
	}

	@Override
	public int hashCode() {
		Integer i = new Integer(a);

		return this.b.hashCode() + i.hashCode();
	}
}
