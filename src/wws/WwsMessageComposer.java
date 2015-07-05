package wws;

import core.MessageComposer;

public class WwsMessageComposer implements MessageComposer {

	@Override
	public String composeMessage() {
		return WwsMessageComposer.class.getSimpleName();
	}

}
