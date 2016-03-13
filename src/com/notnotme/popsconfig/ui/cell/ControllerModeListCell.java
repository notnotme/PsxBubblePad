package com.notnotme.popsconfig.ui.cell;

import com.notnotme.popsconfig.model.gamepad.GamePadMode;
import java.util.ResourceBundle;
import javafx.scene.control.ListCell;

/**
 * @author romain
 */
public final class ControllerModeListCell extends ListCell<GamePadMode> {

	private final ResourceBundle mResources;

	public ControllerModeListCell(ResourceBundle mResources) {
		this.mResources = mResources;
	}

	@Override
	protected void updateItem(GamePadMode item, boolean empty) {
		super.updateItem(item, empty);
		if (item == null || empty) {
			setText(null);
		} else {
			setText(mResources.getString(item.getName()));
		}
	}

}
