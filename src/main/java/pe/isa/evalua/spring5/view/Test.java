package pe.isa.evalua.spring5.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test {
	private static Logger MOLOG = LoggerFactory.getLogger(Test.class);
	private static ConfigurableApplicationContext moCntx;
	
	public static void main(String[] args) throws SQLException {
		/*moCntx = new ClassPathXmlApplicationContext("classpath:/spring/database/spring-postgres.xml");
		DriverManagerDataSource oDataSource = (DriverManagerDataSource) moCntx.getBean("idDriverManagerDataSource");
		Connection oConnection = oDataSource.getConnection();
		PreparedStatement oPS = oConnection.prepareStatement("SELECT * FROM public.\"Peaje\"");
		
		ResultSet oRS = oPS.executeQuery();

		MOLOG.info("=> [EVL] ConfigurableApplicationContext : {}", moCntx);
		MOLOG.info("=> [EVL] DriverManagerDataSource : {}", oDataSource);		
		MOLOG.info("=> [EVL] Connection : {}", oConnection);
		MOLOG.info("=> [EVL] PreparedStatement : {}", oPS);
		MOLOG.info("=> [EVL] ResultSet	: {}", oRS);
		while (oRS.next()) {
			System.out.println(oRS.getObject(1));
			MOLOG.info("=> [EVL] Tipo Plan{}", oRS.getObject(1));
		}
		oRS.close();
		oConnection.close();
		((ConfigurableApplicationContext) moCntx).close();	*/	
	}
}
