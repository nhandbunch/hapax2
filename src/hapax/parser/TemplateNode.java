package hapax.parser;

import hapax.TemplateDictionary;
import hapax.TemplateException;
import hapax.TemplateLoaderContext;

import java.io.PrintWriter;

/**
 * All tokens in the template language are represented by instances of a
 * TemplateNode.
 *
 * @author dcoker
 * @author jdp
 */
public abstract class TemplateNode {

    /**
     * Primary rendering types.
     * @see hapax.Template#render
     */
    public enum TemplateType {
        TemplateTypeSection,
        TemplateTypeNode
    }
 

    volatile int ofs = -1;


    TemplateNode(){
        super();
    }


    public TemplateType getTemplateType(){
        return TemplateType.TemplateTypeNode;
    }
    public void evaluate(TemplateDictionary dict, TemplateLoaderContext context,
                         PrintWriter collector) 
        throws TemplateException 
    {
    }

}