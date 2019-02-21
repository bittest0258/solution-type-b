package problem03;

public class Money {
	
	//
	// 클래스 구현을 완성 하십시오.
	// 

	
	private int amount;
	
	public Money(int amount) {
		this.amount = amount;
		
	}
	

	public Money add(Money money) {
		//amount = amount + money.amount;
		return new Money(amount+money.amount);
		//return this;
	}

	public Money minus(Money money) {
		/*
		 * System.out.println(amount+"**"+money.amount);
		 * 
		 * amount = amount - money.amount; return this;
		 */
		
		return new Money(amount-money.amount);
	}

	public Money multiply(Money money) {
		return new Money(amount*money.amount);
	}

	public Money devide(Money money) {
		return new Money(amount/money.amount);
	}
	

	/*
	 * @Override public int hashCode() { return amount; }
	 */

	@Override
	public boolean equals(Object obj) {
		   if(obj instanceof Money){
		    	
		    	Money money = (Money) obj;
		    
		      if(amount == money.amount){
		        return true;
		      }
		    }
			return false;
	}
	 
	
}