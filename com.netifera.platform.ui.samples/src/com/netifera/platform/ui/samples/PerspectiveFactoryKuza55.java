/**
 * 
 */
package com.netifera.platform.ui.samples;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import com.netifera.platform.ui.samples.views.SampleView;

public class PerspectiveFactoryKuza55 implements IPerspectiveFactory {

	/* (non-Javadoc)
	 * @see org.eclipse.ui.IPerspectiveFactory#createInitialLayout(org.eclipse.ui.IPageLayout)
	 */
	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(true);
		layout.setFixed(false);
		layout.addView(SampleView.ID, IPageLayout.LEFT, 0.33f, editorArea);

	}

}
