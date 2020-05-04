package com.gc.viewer.servletapi;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class BookListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("=========contextInitialized=============");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("=========contextDestroyed=============");
    }
}
