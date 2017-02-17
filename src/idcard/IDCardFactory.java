package idcard;


import java.util.HashMap;


import framework.*;

public class IDCardFactory extends Factory {

	public HashMap<Integer,String> owners = new HashMap<Integer,String>();
	private int no = 0;
	
	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner,no++);
	}

	@Override
	protected void registerProduct(Product product) {
		owners.put(((IDCard)product).getNo(),((IDCard)product).getOwner());
	
	}
	
	

}
