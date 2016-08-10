package me.lpk.gui.panel;

import me.lpk.lang.Lang;

public class OptimizationPanel extends SettingsPanel {
	private static final long serialVersionUID = 12222L;

	@Override
	public void setup() {
		addGroup(createGroup( Lang.translations.get(Lang.GUI_OPTIM_GROUP_CLASS), 
			Lang.OPTION_OPTIM_CLASS_REMOVE_ANNO,
			Lang.OPTION_OPTIM_CLASS_REMOVE_ATRIB,
			Lang.OPTION_OPTIM_CLASS_REMOVE_METHODS,
			Lang.OPTION_OPTIM_CLASS_REMOVE_SRC));
		addGroup(createGroup(Lang.translations.get(Lang.GUI_OPTIM_GROUP_CLASS), 
			Lang.OPTION_OPTIM_METHOD_REMOVE_ANNO,
			Lang.OPTION_OPTIM_METHOD_REMOVE_ATTRIB,
			Lang.OPTION_OPTIM_METHOD_REMOVE_LINES,
			Lang.OPTION_OPTIM_METHOD_REMOVE_LOCALDATA,
			Lang.OPTION_OPTIM_METHOD_REMOVE_PARAMNAME,
			Lang.OPTION_OPTIM_METHOD_REMOVE_FRAMES));
	}
}
