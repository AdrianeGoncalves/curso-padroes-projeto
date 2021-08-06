package br.com.cod3r.factory.apple.simple.factory;

import br.com.cod3r.factory.apple.simple.model.*;

public class IPhoneFactory {

	private IPhone create(String version, String level) {
		IPhone iPhone = null;

		if ("11".equals(version)) {
			if ("standard".equals(level)) {
				iPhone = new IPhone11();
			}

			if ("highEnd".equals(level)) {
				iPhone = new IPhone11Pro();
			}
		}

		if ("X".equals(version)) {
			if ("standard".equals(level)) {
				iPhone = new IPhoneX();
			}

			if ("highEnd".equals(level)) {
				iPhone = new IPhoneXSMax();
			}
		}

		return iPhone;
	}

	public IPhone order(String version, String level) {
		IPhone iPhone = create(version, level);

		iPhone.assemble();
		iPhone.certificates();
		iPhone.pack();

		iPhone.getHardware();

		return iPhone;
	}
}
