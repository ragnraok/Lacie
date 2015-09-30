package com.lacie.processing;

import com.ragnarok.jparseutil.dataobject.AnnotatedObject;
import com.ragnarok.jparseutil.dataobject.CodeInfo;
import com.ragnarok.jparseutil.util.Log;

import java.util.Set;

/**
 * Created by ragnarok on 15/8/15.
 */
public class LacieRoundEnvironment implements RoundEnvironment {
    
    public static final String TAG = "Lacie.LacieRoundEnvironment";
    
    private CodeInfo codeInfo;
    
    public void initFromCodeInfo(CodeInfo codeInfo) {
        this.codeInfo = codeInfo;
    }
    
    @Override
    public Set<? extends AnnotatedObject> getElementAnnotatedWith(String annotationClassName) {
        Log.d(TAG, "getElementAnnotatedWith, annotationClassName: %s", annotationClassName);
        return null;
    }

    @Override
    public CodeInfo getRootCodeInfo() {
        return this.codeInfo;
    }
}
