package edu.eci.pdsw.samples.services;


import org.mybatis.guice.XMLMyBatisModule;
import org.mybatis.guice.datasource.helper.JdbcHelper;

import static com.google.inject.Guice.createInjector;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Injector;

import edu.eci.pdsw.entities.Initiative;
import edu.eci.pdsw.entities.UserType;
import edu.eci.pdsw.persistence.CommentDAO;
import edu.eci.pdsw.persistence.InitiativeDAO;
import edu.eci.pdsw.persistence.UserDAO;
import edu.eci.pdsw.persistence.mybatisimpl.MyBatisCommentDAO;
import edu.eci.pdsw.persistence.mybatisimpl.MyBatisInitiativeDAO;
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
						bind(InitiativeDAO.class).to(MyBatisInitiativeDAO.class);
						bind(CommentDAO.class).to(MyBatisCommentDAO.class);
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
    	
        /*System.out.println(InitiativeServiceFactory.getInstance().getInitiativeServices().getUser("anamariarincon1299@escuelaing.edu.co", "ana123"));
    	
    	System.out.println(InitiativeServiceFactory.getInstance().getInitiativeServices().searchInitiative(1));

    	List<String> kw= new ArrayList<String> (4);
    	kw.add("Construccion");
    	kw.add("Diversion");
    	kw.add("Estudio");
    	kw.add("Administrativo");    	
    	
    	System.out.println(InitiativeServiceFactory.getInstance().getInitiativeServices().searchInitiativeByKeywords(kw));
    	System.out.println(InitiativeServiceFactory.getInstance().getInitiativeServices().listUsers());
    	System.out.println(InitiativeServiceFactory.getInstance().getInitiativeServices().listStatus());
    	
    	System.out.println("Comentarios");
    	System.out.println(InitiativeServiceFactory.getInstance().getInitiativeServices().loadComments());
    	System.out.println("Comentarios de la iniciativa 1");
    	System.out.println(InitiativeServiceFactory.getInstance().getInitiativeServices().loadComment(1));
    	System.out.println("Interesados iniciativa 1");
    	System.out.println(InitiativeServiceFactory.getInstance().getInitiativeServices().loadInterested(1));
    	System.out.println("Cargar iniciativas relacionadas a la 1");
    	System.out.println(InitiativeServiceFactory.getInstance().getInitiativeServices().loadRelated(1));
    	//InitiativeServiceFactory.getInstance().getInitiativeServices().insertInterested(4, 2143);
    	System.out.println(InitiativeServiceFactory.getInstance().getInitiativeServices().getDataChart());
    	System.out.println(InitiativeServiceFactory.getInstance().getInitiativeServices().listInitiative());*/
    	//InitiativeServiceFactory.getInstance().getInitiativeServices().createInitiative("holi", "hey", 2133, kw, "soy nombre");
    	System.out.println(InitiativeServiceFactory.getInstance().getInitiativeServices().loadInitiativeByUser(2133));
    	
    	
    	     
    }
    
}