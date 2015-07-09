package wws;

import core.MessageComposer;

public class WwsMessageComposer implements MessageComposer {

	@Override
	public String composeMessage() {
		return "Nachricht vom " + WwsMessageComposer.class.getSimpleName();
	}

}
