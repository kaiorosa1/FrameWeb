package br.ufes.inf.nemo.frameweb.codegenerator.entity;

import br.ufes.inf.nemo.frameweb.model.frameweb.DomainAttribute;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainClass;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainGeneralization;
import br.ufes.inf.nemo.frameweb.model.frameweb.DomainMethod;
import br.ufes.inf.nemo.frameweb.model.frameweb.ORMTemplate;
import java.net.URLDecoder;
import java.util.List;
import javax.annotation.Generated;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.GeneralizationSet;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
@Generated("org.eclipse.xtend.core.compiler.XtendGenerator")
public class EntityClassCodeGenerator {
  private String domainPackageName;
  
  private DomainClass domainClass;
  
  private ORMTemplate ormTemplate;
  
  /**
   * @param domainClass
   * @param domainPackageName
   * @param ormTemplate
   */
  public EntityClassCodeGenerator(final DomainClass domainClass, final String domainPackageName, final ORMTemplate ormTemplate) {
    this.domainPackageName = domainPackageName;
    this.domainClass = domainClass;
    this.ormTemplate = ormTemplate;
  }
  
  /**
   * Extrai a superclasse de uma classe de dominio
   * 
   * @param domainClass
   */
  public GeneralizationSet getGeneralization(final DomainClass domainClass) {
    GeneralizationSet _xblockexpression = null;
    {
      final Function1<EObject, Boolean> _function = (EObject it) -> {
        return Boolean.valueOf((it instanceof DomainGeneralization));
      };
      EObject generalization = IterableExtensions.<EObject>findFirst(domainClass.eContents(), _function);
      GeneralizationSet _xifexpression = null;
      if ((generalization != null)) {
        _xifexpression = IterableExtensions.<GeneralizationSet>head(((DomainGeneralization) generalization).getGeneralizationSets());
      } else {
        _xifexpression = null;
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  /**
   * Extrai os atributos de uma classe de dominio
   * 
   * @param domainClass
   */
  public List<DomainAttribute> getDomainAttributes(final DomainClass domainClass) {
    final Function1<EObject, Boolean> _function = (EObject it) -> {
      return Boolean.valueOf((it instanceof DomainAttribute));
    };
    final Function1<EObject, DomainAttribute> _function_1 = (EObject it) -> {
      return ((DomainAttribute) it);
    };
    return IterableExtensions.<DomainAttribute>toList(IterableExtensions.<EObject, DomainAttribute>map(IterableExtensions.<EObject>filter(domainClass.eContents(), _function), _function_1));
  }
  
  /**
   * Extrai os metodos de uma classe de dominio
   * 
   * @param domainClass
   */
  public List<DomainMethod> getDomainMethods(final DomainClass domainClass) {
    final Function1<EObject, Boolean> _function = (EObject it) -> {
      return Boolean.valueOf((it instanceof DomainMethod));
    };
    final Function1<EObject, DomainMethod> _function_1 = (EObject it) -> {
      return ((DomainMethod) it);
    };
    return IterableExtensions.<DomainMethod>toList(IterableExtensions.<EObject, DomainMethod>map(IterableExtensions.<EObject>filter(domainClass.eContents(), _function), _function_1));
  }
  
  /**
   * Decodifica os atributos dos templates do modelo frameweb a partir uma URI
   * 
   * @param str
   */
  public String decode(final String str) {
    try {
      return URLDecoder.decode(str, "UTF-8");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public String generateClass() {
    String _xblockexpression = null;
    {
      String classTemplate = this.decode(this.ormTemplate.getClassTemplate());
      classTemplate = classTemplate.replace("FW_PACKAGE", this.domainPackageName);
      String _xifexpression = null;
      boolean _isAbstract = this.domainClass.isAbstract();
      if (_isAbstract) {
        _xifexpression = classTemplate.replace("FW_CLASS_VISIBILITY", "public abstract");
      } else {
        _xifexpression = classTemplate.replace("FW_CLASS_VISIBILITY", "public");
      }
      classTemplate = _xifexpression;
      classTemplate = classTemplate.replace("FW_CLASS_NAME", this.domainClass.getName());
      String _xtrycatchfinallyexpression = null;
      try {
        String _name = this.getGeneralization(this.domainClass).getName();
        String _plus = ("extends " + _name);
        _xtrycatchfinallyexpression = classTemplate.replace("FW_EXTENDS", _plus);
      } catch (final Throwable _t) {
        if (_t instanceof NullPointerException) {
          _xtrycatchfinallyexpression = classTemplate.replace("FW_EXTENDS", "");
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = classTemplate = _xtrycatchfinallyexpression;
    }
    return _xblockexpression;
  }
  
  /**
   * Gera os atributos com seus getters e setters
   */
  public String generateAttributes() {
    String _xblockexpression = null;
    {
      final String attributeTemplate = this.decode(this.ormTemplate.getAttributeTemplate());
      final List<DomainAttribute> attributes = this.getDomainAttributes(this.domainClass);
      final StringBuilder code = new StringBuilder();
      for (final DomainAttribute attribute : attributes) {
        {
          String attributeCode = attributeTemplate;
          attributeCode = attributeCode.replace("FW_ATTRIBUTE_TYPE", attribute.getType().getName());
          attributeCode = attributeCode.replace("FW_ATTRIBUTE_FIRST_UPPER", StringUtils.capitalize(attribute.getName()));
          attributeCode = attributeCode.replace("FW_ATTRIBUTE", attribute.getName());
          attributeCode = attributeCode.replace("FW_VISIBILITY", attribute.getVisibility().toString());
          code.append(attributeCode);
          int _size = attributes.size();
          int _minus = (_size - 1);
          DomainAttribute _get = attributes.get(_minus);
          boolean _tripleNotEquals = (attribute != _get);
          if (_tripleNotEquals) {
            code.append("\n\n");
          }
        }
      }
      _xblockexpression = code.toString().replaceFirst("\t", "");
    }
    return _xblockexpression;
  }
  
  /**
   * TODO um sonho nao tao distante
   * Separar o template de atributos de seus getters e setters
   */
  public Object generateGettersAndSetters() {
    return null;
  }
  
  /**
   * Gera os metodos de classe
   */
  public String generateMethods() {
    String _xblockexpression = null;
    {
      final String methodTemplate = this.decode(this.ormTemplate.getMethodTemplate());
      final String abstractMethodTemplate = this.ormTemplate.getAbstractMethodTemplate();
      final List<DomainMethod> methods = this.getDomainMethods(this.domainClass);
      final StringBuilder code = new StringBuilder();
      for (final DomainMethod method : methods) {
        {
          String methodCode = "";
          boolean _isAbstract = method.isAbstract();
          if (_isAbstract) {
            methodCode = abstractMethodTemplate;
            methodCode = methodCode.replace("FW_METHOD_VISIBILITY", "public abstract");
          } else {
            methodCode = methodTemplate;
            methodCode = methodCode.replace("FW_METHOD_VISIBILITY", "public");
          }
          try {
            methodCode = methodCode.replace("FW_METHOD_RETURN_TYPE", method.getMethodType().getName());
          } catch (final Throwable _t) {
            if (_t instanceof NullPointerException) {
              methodCode = methodCode.replace("FW_METHOD_RETURN_TYPE", "void");
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
          methodCode = methodCode.replace("FW_METHOD_NAME", method.getName());
          code.append(methodCode);
          int _size = methods.size();
          int _minus = (_size - 1);
          DomainMethod _get = methods.get(_minus);
          boolean _tripleNotEquals = (method != _get);
          if (_tripleNotEquals) {
            code.append("\n\n");
          }
        }
      }
      _xblockexpression = code.toString().replaceFirst("\t", "");
    }
    return _xblockexpression;
  }
  
  /**
   * The magic
   */
  public String generate() {
    String _xblockexpression = null;
    {
      String template = this.generateClass();
      template = template.replace("FW_CLASS_ATTRIBUTES", this.generateAttributes());
      _xblockexpression = template = template.replace("FW_CLASS_METHOD", this.generateMethods());
    }
    return _xblockexpression;
  }
}
