/**
 *
 * $Id$
 */
package frameweb.validation;

import frameweb.NavigationComposition;
import frameweb.Tag;
import frameweb.TagLib;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link frameweb.Template}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TemplateValidator {
	boolean validate();

	boolean validateTemplateClassAttribute(EList<Tag> value);
	boolean validateTemplateTagLib(EList<TagLib> value);

	boolean validateTemplateComposition(EList<NavigationComposition> value);
}
