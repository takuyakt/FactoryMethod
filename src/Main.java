import java.security.acl.Owner;

import framework.*;
import idcard.*;


public class Main {

	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product card1 = factory.creates("����_");
		Product card2 = factory.creates("�Ƃނ�");
		Product card3 = factory.creates("�����Ԏq");
		card1.use();
		card2.use();
		card3.use();
		System.out.println(((IDCardFactory)factory).owners.toString());
	}

	//4-1
	//IDcardFactory���炵��new�����Ȃ��悤�ɂ���Ӑ}
	
	//4-2
	//
	
}
