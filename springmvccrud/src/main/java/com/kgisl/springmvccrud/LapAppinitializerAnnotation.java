package com.kgisl.springmvccrud;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class LapAppinitializerAnnotation extends AbstractAnnotationConfigDispatcherServletInitializer{

    @Override
    protected Class<?>[] getRootConfigClasses() {  
        return new Class[]{LaptopRootConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
       return new Class[]{LaptopMvcConfig.class} ;    
    }

    @Override
    protected String[] getServletMappings() {
       
         return new String[]{"/", "/lapform","/save", "/viewlap","/editlap","/deletelap","/editsave"};
        // return new String[]{"/"};
    }
    
}
