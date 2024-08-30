import java.sql.Connection;
import java.sql.SQLException;

import br.com.alura.jdbc.modelo.ConnectionFactory;

public class TestaConexao {

	public static void main(String[] args) throws SQLException {
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection con = connectionFactory.recuperarConexao();	
		
		System.out.println("fechando conexao");
		
		con.close();
	}

}
