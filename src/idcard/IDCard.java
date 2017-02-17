package idcard;
import framework.*;

public class IDCard extends Product {
	
	private String owner;
	private int no ;
	
	public IDCard(String owner,int no)
	{
		System.out.println(owner + "のカードを作ります。");
		this.owner = owner;
		this.no = no;
	}

	@Override
	public void use() 
	{
		System.out.println(owner + "のカードを使います。");	
	}
	
	public String getOwner(){
		return owner;
	}
	public int getNo(){
		return no;
	}
	
}
