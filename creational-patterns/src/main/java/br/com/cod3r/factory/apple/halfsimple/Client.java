package br.com.cod3r.factory.apple.halfsimple;

import br.com.cod3r.factory.apple.halfsimple.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.halfsimple.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.halfsimple.model.IPhone;

public class Client {

	public static void main(String[] args) {
		IPhoneXFactory iPhoneXFactory = new IPhoneXFactory();
		IPhone11Factory iPhone11ProFactory = new IPhone11Factory();

		System.out.println("### Ordering an iPhone X");
		IPhone iPhoneX = iPhoneXFactory.order("standard");
		System.out.println(iPhoneX);
		
		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone11HighEnd = iPhone11ProFactory.order("highEnd");
		System.out.println(iPhone11HighEnd);
	}
}
