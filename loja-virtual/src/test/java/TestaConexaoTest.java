import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class TestaConexaoTest {

	@Test
	public void test() throws SQLException {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection con = connectionFactory.recuperarConexao();	
		
		
		
		con.close();
		
		Assert.assertEquals(con.isClosed(), true);
	}

}
