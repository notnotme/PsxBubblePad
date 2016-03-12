package com.notnotme.psxbubblepad.ui.factory;

import com.notnotme.psxbubblepad.model.gamepad.PsxButton;
import com.notnotme.psxbubblepad.model.gamepad.GamePadMapping;
import com.notnotme.psxbubblepad.model.gamepad.GamePadMode;
import com.notnotme.psxbubblepad.model.gamepad.GamePadPort;
import com.notnotme.psxbubblepad.ui.cell.ControllerControlsListCell;
import com.notnotme.psxbubblepad.ui.cell.ControllerModeListCell;
import com.notnotme.psxbubblepad.ui.cell.ControllerPortListCell;
import com.notnotme.psxbubblepad.ui.cell.PsxButtonListCell;
import java.util.ResourceBundle;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;

/**
 * @author romain
 */
public class ListCellFactory {

	public static PsxButtonListCell getPsxButtonListCell(ResourceBundle resources) {
		return new PsxButtonListCell(resources);
	}

	public static Callback<ListView<PsxButton>, ListCell<PsxButton>> getPsxButtonCellFactory(ResourceBundle resources) {
		return (ListView<PsxButton> param) -> getPsxButtonListCell(resources);
	}

	public static ControllerControlsListCell getControllerControlsListCell(ResourceBundle resources) {
		return new ControllerControlsListCell(resources);
	}

	public static Callback<ListView<GamePadMapping>, ListCell<GamePadMapping>> getControllerControlsCellFactory(ResourceBundle resources) {
		return (ListView<GamePadMapping> param) -> getControllerControlsListCell(resources);
	}

	public static ControllerPortListCell getControllerPortListCell(ResourceBundle resources) {
		return new ControllerPortListCell(resources);
	}

	public static Callback<ListView<GamePadPort>, ListCell<GamePadPort>> getControllerPortCellFactory(ResourceBundle resources) {
		return (ListView<GamePadPort> param) -> getControllerPortListCell(resources);
	}

	public static ControllerModeListCell getControllerModeListCell(ResourceBundle resources) {
		return new ControllerModeListCell(resources);
	}

	public static Callback<ListView<GamePadMode>, ListCell<GamePadMode>> getControllerModeCellFactory(ResourceBundle resources) {
		return (ListView<GamePadMode> param) -> getControllerModeListCell(resources);
	}

}
