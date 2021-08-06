package br.com.cod3r.factory.apple.halfsimple.factory;

import br.com.cod3r.factory.apple.halfsimple.model.IPhone;

public abstract class IPhoneFactory {

	protected abstract IPhone create(String level);

	public IPhone order(String level) {
		IPhone iPhone = create(level);

		iPhone.assemble();
		iPhone.certificates();
		iPhone.pack();

		iPhone.getHardware();

		return iPhone;
	}
}
