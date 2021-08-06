package br.com.cod3r.factory.apple.simple;

import br.com.cod3r.factory.apple.simple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.simple.model.IPhone;

public class Client {

	public static void main(String[] args) {
		IPhoneFactory iPhoneFactory = new IPhoneFactory();

		System.out.println("### Ordering an iPhone X");
		IPhone iPhoneX = iPhoneFactory.order("X", "standard");
		System.out.println(iPhoneX);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone11HighEnd = iPhoneFactory.order("11","highEnd");
		System.out.println(iPhone11HighEnd);
	}
}
