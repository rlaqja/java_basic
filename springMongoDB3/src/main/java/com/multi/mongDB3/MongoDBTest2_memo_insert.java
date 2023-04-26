package com.multi.mongDB3;

import java.util.ArrayList;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;

public class MongoDBTest2_memo_insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MongoClient client = new MongoClient("localhost",27017);
			System.out.println("1,몽고db 프로그램에 연결성공");
			
			MongoDatabase database = client.getDatabase("shop2");
			System.out.println("2.shop2 db로 연결 성공.");
			
			MongoCollection<Document> collection = database.getCollection("memo");
			System.out.println("3.member 컬렉션에 연결성공");
			
			Document doc = new Document();
			doc.append("age", 500);
			doc.append("name", "song");
			doc.append("office", "busan");
			doc.append("phone", "011");
			System.out.println("4.memo 컬렉션에 연결성공");
			collection.insertOne(doc);

			Document doc2 = new Document();
			doc2.append("age", 501);
			doc2.append("name", "song2");
			doc2.append("office", "busan");
			doc2.append("phone", "011");
			
			Document doc3 = new Document();
			doc3.append("age", 502);
			doc3.append("name", "song3");
			doc3.append("office", "seoul");
			doc3.append("phone", "011");

			Document doc4 = new Document();
			doc4.append("age", 503);
			doc4.append("name", "song4");
			doc4.append("office", "busan");
			doc4.append("phone", "011");
		
			ArrayList<Document> list = new ArrayList<>();
			list.add(doc2);
			list.add(doc3);
			list.add(doc4);
			
			collection.insertMany(list);
			System.out.println("4.memo 컬렉션에 연결성공");
			
			Document filter = new Document();
			filter.append("age", 500);
			
			collection.deleteOne(filter);
			System.out.println("4.memo 컬렉션에 연결성공");
			
			Document filter1 = new Document();
			filter1.append("age", 501);
			
			Bson setts = Updates.set("name", "songsong");
			
			collection.updateOne(filter1, setts);
			System.out.println("4.memo 컬렉션에 연결성공");
			
			Document filter2 = new Document();
			filter2.append("office", "busan");
			
			Bson setts2 = Updates.set("phone", "9999");
			Bson setts3 = Updates.set("name", "songsong2");
			Bson setts4 = Updates.set("age", 555);
			
			ArrayList<Bson> list2 = new ArrayList<Bson>();
			list2.add(setts2);
			list2.add(setts3);
			list2.add(setts4);
			
			Bson setts5 = Updates.combine(list2);
			
			collection.updateMany(filter2, setts5);
			client.close();
	}

}
