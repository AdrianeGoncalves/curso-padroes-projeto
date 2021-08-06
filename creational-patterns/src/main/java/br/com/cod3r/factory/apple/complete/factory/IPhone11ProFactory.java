package br.com.cod3r.factory.apple.complete.factory;

import br.com.cod3r.factory.apple.complete.model.IPhone;
import br.com.cod3r.factory.apple.complete.model.IPhone11Pro;

public class IPhone11ProFactory extends IPhoneFactory {

	@Override
	protected IPhone create() {
		return new IPhone11Pro();
	}
}
