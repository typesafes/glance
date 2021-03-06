/**
 * 
 */
package com.xored.glance.ui.controls.descriptors;

import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Tree;

import com.xored.glance.ui.controls.tree.TreeControlSource;
import com.xored.glance.ui.sources.ITextSource;
import com.xored.glance.ui.sources.ITextSourceDescriptor;

/**
 * @author Yuri Strot
 * 
 */
public class TreeDescriptor implements ITextSourceDescriptor {

	public ITextSource createSource(Control control) {
		return new TreeControlSource((Tree) control);
	}

	public boolean isValid(Control control) {
		return control instanceof Tree;
	}

}
