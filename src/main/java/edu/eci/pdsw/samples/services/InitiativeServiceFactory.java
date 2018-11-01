package edu.eci.pdsw.samples.services;


import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import static com.google.inject.Guice.createInjector;
import com.google.inject.Injector;


public class InitiativeServiceFactory {

    private static InitiativeServiceFactory instance = new InitiativeServiceFactory();
    
    private static Injector injector;
    private static Injector testingInjector;
    
    private InitiativeServiceFactory(){
        injector = createInjector(new XMLMyBatisModule() {

                    @Override
                    protected void initialize() {
                        install(JdbcHelper.PostgreSQL);                        
                        setClassPathResource("mybatis-config.xml");                        
                    }

                }
                
        );
        
        testingInjector = createInjector(new XMLMyBatisModule() {

                    @Override
                    protected void initialize() {
                        install(JdbcHelper.PostgreSQL);                        
                        setClassPathResource("h2-mybatis-config.xml");                        
                        
                    }

                }
                
        );
        
    }
    
    public static InitiativeServiceFactory getInstance(){
        return instance;
    }
    
   
    
}