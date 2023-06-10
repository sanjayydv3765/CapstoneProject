package JDBCConnection;

import java.util.Objects;

public class DataPageManager {
	
	private Databaseconnect databaseconnect;

    public Databaseconnect d_getDatabaseconnect()
    {
         return(Objects.isNull(databaseconnect))? databaseconnect= new Databaseconnect():databaseconnect;
    }

	
	
}
