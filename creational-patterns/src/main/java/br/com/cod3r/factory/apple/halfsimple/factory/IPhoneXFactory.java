package br.com.cod3r.factory.apple.halfsimple.factory;

import br.com.cod3r.factory.apple.halfsimple.model.*;

public class IPhoneXFactory extends IPhoneFactory {

	@Override
	protected IPhone create(String level) {
		IPhone iPhone = null;

		switch (level) {
			case "standard":
				iPhone = new IPhoneX();
				break;
			case "highEnd":
				iPhone = new IPhoneXSMax();
				break;
		}

		return iPhone;
	}
}
