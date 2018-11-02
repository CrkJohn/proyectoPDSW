package edu.eci.pdsw.samples.services;


import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import static com.google.inject.Guice.createInjector;
import com.google.inject.Injector;

import edu.eci.pdsw.persistence.UserDAO;
import edu.eci.pdsw.persistence.mybatisimpl.MyBatisUserDao;
import edu.eci.pdsw.samples.services.impl.InitiativeServiceImpl;
import edu.eci.pdsw.samples.services.impl.InitiativeServicesStub;


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
                        bind(UserDAO.class).to(MyBatisUserDao.class);
                        bind(InitiativeServices.class).to(InitiativeServiceImpl.class);
                    }

                }
                
        );
        
        /*testingInjector = createInjector(new XMLMyBatisModule() {

                    @Override
                    protected void initialize() {
                        install(JdbcHelper.PostgreSQL);                        
                        setClassPathResource("mybatis-config-h2.xml");                        
                        bind(UserDAO.class).to(MyBatisUserDao.class);
                        bind(InitiativeServices.class).to(InitiativeServicesStub.class);
                    }

                }
                
        );*/
        
    }
    
    public InitiativeServices getInitiativeServices(){
        return injector.getInstance(InitiativeServices.class);   
    }

    public InitiativeServices getInitiativeServicesForTesting(){
        return testingInjector.getInstance(InitiativeServices.class);   
    }
    
    public static InitiativeServiceFactory getInstance(){
        return instance;
    }
    
    public static void main(String a[]) throws ServicesException{
        System.out.println(InitiativeServiceFactory.getInstance().getInitiativeServices().getUser(2133));
    }
    
}