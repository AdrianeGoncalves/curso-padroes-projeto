package br.com.cod3r.factory.apple.complete.factory;

import br.com.cod3r.factory.apple.complete.model.IPhone;
import br.com.cod3r.factory.apple.complete.model.IPhoneX;

public class IPhoneXFactory extends IPhoneFactory {

	@Override
	protected IPhone create() {
		return new IPhoneX();
	}
}
