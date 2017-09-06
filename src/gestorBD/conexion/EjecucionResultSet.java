package gestorBD.conexion;


import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Interfaz que representa el trabajo con un ResultSet luego de hacer todo el
 * trabajo de preparación de la conexión a la BD
 *
 * @author alpedraz
 *
 */
@FunctionalInterface
public interface EjecucionResultSet {

	/**
	 * Trabajo a realizar con el ResultSet
	 */
	void trabajarResultSet(ResultSet resultSet) throws SQLException;
}
