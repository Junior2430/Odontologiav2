package main.java;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppInitializer implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        //  configuración de la base de datos, etc.
        try {
            DatabaseConnection.getConnection();
            System.out.println("Conexión a la base de datos establecida.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // base de datos cerrada.
        try {
            DatabaseConnection.getConnection().close();
            System.out.println("Conexión a la base de datos cerrada.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
