package com.kgisl.springmvccrud;

import javax.servlet.ServletContext;
// import javax.servlet.ServletException;
// import javax.servlet.ServletRegistration;

// import org.springframework.web.WebApplicationInitializer;
// import org.springframework.web.context.support.XmlWebApplicationContext;
// import org.springframework.web.servlet.DispatcherServlet;

// public class LapAppInitailzer  implements WebApplicationInitializer{

//     @Override
//     public void onStartup(ServletContext servletcontext) throws ServletException {
        
//         XmlWebApplicationContext xmlwebapplicationcontext=new XmlWebApplicationContext();

//         //putting the spring configuration xml file
//         xmlwebapplicationcontext.setConfigLocation("classpath:laptop-config.xml");

//         //creating dispatcher servlet object
//         DispatcherServlet dispatcherservlet=new DispatcherServlet(xmlwebapplicationcontext);

//         //registering dispatcher servlet with servlet context
//         ServletRegistration.Dynamic myCustomDispatcherServlet=servletcontext.addServlet("myDispatcherServlet",dispatcherservlet);

//         //setting load on startup
//         myCustomDispatcherServlet.setLoadOnStartup(1);

//         //adding mapping url
//         myCustomDispatcherServlet.addMapping("/");

        
//     }

   
// }
