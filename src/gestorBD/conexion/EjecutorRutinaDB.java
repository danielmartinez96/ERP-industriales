/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorBD.conexion;

import clasesAuxiliares.Page;
import static clasesAuxiliares.Page.getStartItemByPage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

public class EjecutorRutinaDB {

	/*
	 * TODO Pendiente:
	 * 	- Sobrecargar ejecutarSelectPreparedStatement() para recibir otro tipo de parámetros
	 * 	- implementar ejecutarUpdatePreparedStatement()
	 * 	- Refactorizar código repetido
	 */

	private static final String DRIVER_CLASS = "com.mysql.jdbc.Driver";
	private static final String DB_URL = "jdbc:mysql://localhost/dbindustriales";
	private static final String USUARIO = "root";
	private static final String PASSWORD = "";

	private static Connection conexion;

	public static void ejecutarSelectStatement(final EjecucionResultSet ejecucionResultSet, final String selectQuery) {
		try {
			cargarDriverCrearConexion();
			final Statement stmt = conexion.createStatement();
			final ResultSet rs = stmt.executeQuery(selectQuery);

			ejecucionResultSet.trabajarResultSet(rs);

			cerrarRecursos(stmt, rs);
		} catch (final SQLException e) {
			manejarSQLException(e);
		}
	}

	public static int ejecutarUpdateStatement(final String updateQuery) {
		int resultadoQuery = 0;

		try {
			cargarDriverCrearConexion();
			final Statement stmt = conexion.createStatement();

			resultadoQuery = stmt.executeUpdate(updateQuery);
                        System.out.println("Se cargo correctamente");
                        

			cerrarRecursos(stmt);
		} catch (final SQLException e) {
			manejarSQLException(e);
		}

		return resultadoQuery;
	}

        public static int ejecutarUpdateStatementConKey(final String updateQuery) {
		int resultadoQuery = 0;
                int key=-1;
		try {
			cargarDriverCrearConexion();
			final Statement stmt = conexion.createStatement();

			resultadoQuery = stmt.executeUpdate(updateQuery,Statement.RETURN_GENERATED_KEYS);
                        System.out.println("Se cargo correctamente");
                        
                        final ResultSet rs= stmt.getGeneratedKeys();
                        while(rs.next()){
                              key=rs.getInt(1);
                        }
                        
			cerrarRecursos(stmt);
		} catch (final SQLException e) {
			manejarSQLException(e);
		}

		return key;
	}
        
	public static void ejecutarSelectPreparedStatement(final EjecucionResultSet ejecutorResultSet,
			final String selectQuery,
			final int parametro) {
		try {
			cargarDriverCrearConexion();
			final PreparedStatement preparedStatement = conexion.prepareStatement(selectQuery);
			preparedStatement.setInt(1, parametro);
			final ResultSet resultSet = preparedStatement.executeQuery();

			ejecutorResultSet.trabajarResultSet(resultSet);

			cerrarRecursos(preparedStatement, resultSet);
		} catch (final SQLException e) {
			manejarSQLException(e);
		}
	}

        public static void getPage(final EjecucionResultSet ejecutorResultSet,
			final String selectQuery){
      
    try {
			cargarDriverCrearConexion();
			final PreparedStatement preparedStatement = conexion.prepareStatement( selectQuery,ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_READ_ONLY);
			
			final ResultSet resultSet = preparedStatement.executeQuery();

			ejecutorResultSet.trabajarResultSet(resultSet);
                       
			cerrarRecursos(preparedStatement, resultSet);
		} catch (final SQLException e) {
			manejarSQLException(e);
		}
}
        
	private static void cargarDriverCrearConexion() throws SQLException {
		try {
			Class.forName(DRIVER_CLASS);
			conexion = DriverManager.getConnection(DB_URL, USUARIO, PASSWORD);
		} catch (final ClassNotFoundException e) {
			System.out.println("Driver no disponible");
			e.printStackTrace();
		}
	}

	private static void cerrarRecursos(final Statement statement) throws SQLException {
		statement.close();
		
             //   conexion.commit();
		conexion.close(); 
               
	}

	private static void cerrarRecursos(final Statement statement, final ResultSet resultSet) throws SQLException {
		resultSet.close();
		statement.close();

		// TODO Verificar estado de conexión
              
                  
		conexion.close(); 
                
		
	}

	private static void manejarSQLException(final SQLException sqlExeption) {
		System.out.println("Error al ejecutar la consulta");
		sqlExeption.printStackTrace();
	}
        
        
        public static void crearBD(String query)
        {
            
            try {
			cargarDriverCrearConexion();
			final Statement stmt = conexion.createStatement();
			stmt.execute(query);

			cerrarRecursos(stmt);
		} catch (final SQLException e) {
			manejarSQLException(e);
		}
            
            
        }

   
        
        
        
}
