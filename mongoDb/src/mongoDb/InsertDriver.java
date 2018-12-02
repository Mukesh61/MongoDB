package mongoDb;

import java.util.Iterator; 
import org.bson.Document; 
import com.mongodb.MongoClient; 
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase; 

public class InsertDriver { 
   
   public static void main( String args[] ) {  
   
      // Creating a Mongo client 
      MongoClient mongo = new MongoClient( "localhost" , 27017 );      
      // Accessing the database 
      MongoDatabase database = mongo.getDatabase("mukesh");
      //showing all the database
//      for (String name : database.listCollectionNames()) { 
//          System.out.println(name); }
      
//      //Creating a collection 
//      database.createCollection("samplCollection"); 
//      System.out.println("Collection created successfully"); 
       //dropping the collection
      // Retieving a collection
//      MongoCollection<Document> collectin = database.getCollection("samplCollection");
//
//      // Dropping a Collection 
//      collectin.drop(); 
//      System.out.println("Collection dropped successfully");

      // Retrieving a collection
      MongoCollection<Document> collection = database.getCollection("InfosysTest");
      System.out.println("Collection sampleCollection selected successfully"); 

      FindIterable<Document> iterDoc = collection.find(); 
      int i = 1; 

      // Getting the iterator 
      Iterator it = iterDoc.iterator(); 

      while (it.hasNext()) {  
         System.out.println("Inserted Document: "+i);  
         System.out.println(it.next());  
         i++; 
      }       
   } 
}