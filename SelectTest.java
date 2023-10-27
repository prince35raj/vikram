
import java.sql.*;
public class SelectTest
{
	public static void main(String[]args)  throws Exception
	{
		//Establish THe Connection
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","prince");

	
	Statement st=con.createStatement();

	
	ResultSet rs=st.executeQuery("SELECT * FROM STUDENT");

	while(rs.next()!=false){
				// System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getFloat(4));
				// System.out.println(rs.getInt("SNO")+"  "+rs.getString("SNAME")+"  "+rs.getString("SADD")+"  "+rs.getFloat("AVG"));
				 System.out.println(rs.getString("SID")+"  "+rs.getString("SNAME")+"  "+rs.getString("SFEE"));
			}
			//close jdbc objs
			   rs.close();
			   st.close();
			   con.close();

	}

} 