package pe.isa.evalua.spring5.model;

import java.sql.Connection;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CDTypePet {
private static Logger MOLOG = LoggerFactory.getLogger(CDTypePet.class);
	
	private DataSource dataSource;
	private Connection oCxn = null;
	private java.sql.Date oFechaSql;
	private java.sql.Timestamp oFechaTimeStamp;
	

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}	
}
