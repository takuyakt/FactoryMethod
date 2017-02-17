import java.security.acl.Owner;

import framework.*;
import idcard.*;


public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.creates("結城浩");
		Product card2 = factory.creates("とむら");
		Product card3 = factory.creates("佐藤花子");
		card1.use();
		card2.use();
		card3.use();
		System.out.println(((IDCardFactory)factory).owners.toString());
	}

	//4-1
	//IDcardFactoryからしかnewさせないようにする意図
	
	//4-2
	//
	
}
