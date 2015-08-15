package com.lacie.processing;

import com.ragnarok.jparseutil.dataobject.CodeInfo;

import java.util.Set;

/**
 * Created by ragnarok on 15/8/15.
 * this interface declare a similar API as {@link javax.annotation.processing.RoundEnvironment},
 * which makes the processor can query for information about the annotation
 */
public interface RoundEnvironment {

    /**
     * init this RoundEnvironment from a {@link CodeInfo}, which the parse result 
     * of a codebase
     * @param code
     */
    void initFromCodeInfo(CodeInfo code);

    /**
     * get the object annotationed with {@param annotationClassName}
     * @param annotationClassName the annotatation class name, must be fully qualified 
     * @return
     */
    Set<Object> getElementAnnotationedWith(String annotationClassName);
}
