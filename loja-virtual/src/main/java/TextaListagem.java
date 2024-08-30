import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TextaListagem {

	public static void main(String[] args) throws SQLException {

		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		try (Connection connection = connectionFactory.recuperarConexao()){	
					
			PreparedStatement stm = connection.prepareStatement("SELECT ID, NOME, DESCRICAO FROM PRODUTO");
			stm.execute();
			
			try (ResultSet rst = stm.getResultSet()){
			
				while(rst.next()) {
					Integer id = rst.getInt("ID");
					System.out.println(id);
					String nome =rst.getString("NOME");
					System.out.println(nome);
					String descricao = rst.getString("DESCRICAO");
					System.out.println(descricao);					
					System.out.println("----------");
				}
			}	
		

		}
	}

}
