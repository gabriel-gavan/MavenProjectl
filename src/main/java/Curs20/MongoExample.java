package Curs20;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.ListCollectionsIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoExample {

	//connect to Mongo
	public static MongoClient connectToMongo() {
		try {
			ConnectionString connectionString = new ConnectionString("mongodb+srv://testuser:testuser@cluster0.bkai1.mongodb.net/sample_analytics?retryWrites=true&w=majority");
			MongoClientSettings setting = MongoClientSettings.builder()
					.applyConnectionString(connectionString)
					.serverApi(ServerApi.builder().version(ServerApiVersion.V1).build())
					.build();
		
			MongoClient mongoClient = MongoClients.create(setting);
			return mongoClient;
		} catch (MongoException e){
			System.out.println("Could not make a connection!");
		}
		
		
		return null;
	}
	
	public static void main(String[] args) {
		
	 MongoClient mongoClient = connectToMongo();
	 
	 MongoDatabase databasaSampleAnalytics = mongoClient.getDatabase("sample_analytics");
	 for (String name:databasaSampleAnalytics.listCollectionNames()) {
		 System.out.println("Collection name:" + name);
	 }
	 mongoClient.close();
	 
	}

}
