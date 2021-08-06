package br.com.cod3r.factory.apple.complete.factory;

import br.com.cod3r.factory.apple.complete.model.IPhone;
import br.com.cod3r.factory.apple.complete.model.IPhone11;

public class IPhone11Factory extends IPhoneFactory {

	@Override
	protected IPhone create() {
		return new IPhone11();
	}
}
