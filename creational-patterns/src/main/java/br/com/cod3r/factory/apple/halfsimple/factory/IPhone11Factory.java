package br.com.cod3r.factory.apple.halfsimple.factory;

import br.com.cod3r.factory.apple.halfsimple.model.IPhone;
import br.com.cod3r.factory.apple.halfsimple.model.IPhone11;
import br.com.cod3r.factory.apple.halfsimple.model.IPhone11Pro;

public class IPhone11Factory extends IPhoneFactory {

	@Override
	protected IPhone create(String level) {
		IPhone iPhone = null;

		switch (level) {
			case "standard":
				iPhone = new IPhone11();
				break;
			case "highEnd":
				iPhone = new IPhone11Pro();
				break;
		}

		return iPhone;
	}
}
