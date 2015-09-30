package com.lacie.processing;

import com.ragnarok.jparseutil.dataobject.AnnotatedObject;
import com.ragnarok.jparseutil.dataobject.CodeInfo;

import java.util.Set;

/**
 * Created by ragnarok on 15/8/15.
 * this interface declare a similar API as {@link javax.annotation.processing.RoundEnvironment},
 * which makes the processor can query for information about the annotation
 */
public interface RoundEnvironment {
    

    /**
     * get the object annotationed with {@param annotationClassName}
     * @param annotationClassName the annotatation class name, must be fully qualified 
     * @return
     */
    Set<? extends AnnotatedObject> getElementAnnotatedWith(String annotationClassName);

    /**
     * get the {@link CodeInfo} represent this codebase
     * @return
     */
    CodeInfo getRootCodeInfo();
    
}
