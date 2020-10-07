package eu.objectivum;

import org.apache.catalina.*;
import org.apache.catalina.startup.Tomcat;

public class ApplicationLauncher {

  public static void main(String[] args) throws LifecycleException {

    final Tomcat tomcat = new Tomcat();
    tomcat.setPort(8080);
    tomcat.getConnector();

    final Context context = tomcat.addContext("", null);
    final Wrapper servlet = Tomcat.addServlet(context, "myFirstServlet", new MyFirstServlet());
    servlet.setLoadOnStartup(1);
    servlet.addMapping("/*");

    tomcat.start();
  }
}
