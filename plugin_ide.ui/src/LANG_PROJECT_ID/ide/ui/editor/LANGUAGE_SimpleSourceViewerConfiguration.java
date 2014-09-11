/*******************************************************************************
 * Copyright (c) 2014, 2014 Bruno Medeiros and other Contributors.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Bruno Medeiros - initial API and implementation
 *******************************************************************************/
package LANG_PROJECT_ID.ide.ui.editor;

import org.eclipse.cdt.ui.text.IColorManager;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IInformationControlCreator;
import org.eclipse.jface.text.ITextHover;
import org.eclipse.jface.text.formatter.IContentFormatter;
import org.eclipse.jface.text.hyperlink.IHyperlinkDetector;
import org.eclipse.jface.text.information.IInformationPresenter;
import org.eclipse.jface.text.source.IAnnotationHover;
import org.eclipse.jface.text.source.ISourceViewer;

public class LANGUAGE_SimpleSourceViewerConfiguration extends LANGUAGE_SourceViewerConfiguration {
	
	public LANGUAGE_SimpleSourceViewerConfiguration(IPreferenceStore preferenceStore, IColorManager colorManager) {
		super(preferenceStore, colorManager, null);
	}
	
	@Override
	public IAutoEditStrategy[] getAutoEditStrategies(
			ISourceViewer sourceViewer, String contentType) {
		return null;
	}
	
	@Override
	public IAnnotationHover getAnnotationHover(ISourceViewer sourceViewer) {
		return null;
	}
	
	@Override
	public IAnnotationHover getOverviewRulerAnnotationHover(
			ISourceViewer sourceViewer) {
		return null;
	}
	
	@Override
	public int[] getConfiguredTextHoverStateMasks(ISourceViewer sourceViewer, String contentType) {
		return null;
	}
	
	@Override
	public ITextHover getTextHover(ISourceViewer sourceViewer, String contentType, int stateMask) {
		return null;
	}
	
	@Override
	public ITextHover getTextHover(ISourceViewer sourceViewer, String contentType) {
		return null;
	}
	
	@Override
	public IContentFormatter getContentFormatter(ISourceViewer sourceViewer) {
		return null;
	}
	
	@Override
	public IInformationControlCreator getInformationControlCreator(ISourceViewer sourceViewer) {
		return null;
	}
	
	@Override
	public IInformationPresenter getInformationPresenter(ISourceViewer sourceViewer) {
		return null;
	}
	
	@Override
	public IHyperlinkDetector[] getHyperlinkDetectors(ISourceViewer sourceViewer) {
		return null;
	}
	
}