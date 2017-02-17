import java.security.acl.Owner;

import framework.*;
import idcard.*;


public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.creates("åãèÈç_");
		Product card2 = factory.creates("Ç∆ÇﬁÇÁ");
		Product card3 = factory.creates("ç≤ì°â‘éq");
		card1.use();
		card2.use();
		card3.use();
		System.out.println(((IDCardFactory)factory).owners.toString());
	}

	//4-1
	//IDcardFactoryÇ©ÇÁÇµÇ©newÇ≥ÇπÇ»Ç¢ÇÊÇ§Ç…Ç∑ÇÈà”ê}
	
	//4-2
	//
	
}
