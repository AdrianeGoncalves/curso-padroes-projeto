package br.com.cod3r.factory.apple.complete;

import br.com.cod3r.factory.apple.complete.factory.IPhone11ProFactory;
import br.com.cod3r.factory.apple.complete.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.complete.model.IPhone;

public class Client {

	public static void main(String[] args) {
		IPhoneXFactory iPhoneXFactory = new IPhoneXFactory();
		IPhone11ProFactory iPhone11ProFactory = new IPhone11ProFactory();

		System.out.println("### Ordering an iPhone X");
		IPhone iPhoneX = iPhoneXFactory.order();
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone11HighEnd = iPhone11ProFactory.order();
	}
}
