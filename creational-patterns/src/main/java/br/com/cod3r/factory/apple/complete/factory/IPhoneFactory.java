package br.com.cod3r.factory.apple.complete.factory;

import br.com.cod3r.factory.apple.complete.model.IPhone;

public abstract class IPhoneFactory {

	protected abstract IPhone create();

	public IPhone order() {
		IPhone iPhone = create();

		iPhone.assemble();
		iPhone.certificates();
		iPhone.pack();

		iPhone.getHardware();

		return iPhone;
	}
}
