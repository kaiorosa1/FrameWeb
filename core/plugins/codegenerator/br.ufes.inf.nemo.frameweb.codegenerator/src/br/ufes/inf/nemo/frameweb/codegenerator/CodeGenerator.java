package br.ufes.inf.nemo.frameweb.codegenerator;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.sirius.diagram.DSemanticDiagram;
import org.eclipse.sirius.tools.api.ui.IExternalJavaAction;

import br.ufes.inf.nemo.frameweb.codegenerator.entity.EntityModelCodeGenerator;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;
import br.ufes.inf.nemo.frameweb.utils.ProjectUtils;

public class CodeGenerator implements IExternalJavaAction {

	@Override
	public boolean canExecute(Collection<? extends EObject> selections) {
		boolean canExecute = selections
			.stream()
			.anyMatch(DSemanticDiagram.class::isInstance);
		
		return canExecute;
	}

	@Override
	public void execute(Collection<? extends EObject> selections, Map<String, Object> parameters) {
		IProject project = ProjectUtils.getSelectedProject();
		IFolder srcFolder = project.getFolder("src");
		
		ProjectRepresentation representation = new ProjectRepresentation(selections);
		
		ORMTemplate ormTemplate = representation.getORMTemplate();
		
		representation.getEntityModels()
				.stream()
				.map(entityModel -> new EntityModelCodeGenerator(entityModel, ormTemplate))
				.forEach(entityModelCodeGenerator -> entityModelCodeGenerator.generate(srcFolder));
	}

}
