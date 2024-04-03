package us.deathmarine.luyten.decompile;

import us.deathmarine.luyten.ui.model.Selection;

import java.util.Map;
import java.util.Set;

public interface LinkProvider {

	public void generateContent();

	public String getTextContent();

	public void processLinks();

	public Map<String, Selection> getDefinitionToSelectionMap();

	public Map<String, Set<Selection>> getReferenceToSelectionsMap();

	public boolean isLinkNavigable(String uniqueStr);

	public String getLinkDescription(String uniqueStr);

}
