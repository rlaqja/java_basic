package com.multi.mongoDB3;

import java.util.ArrayList;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Updates;

public class MongoDBTest2_update2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MongoClient client = new MongoClient("localhost",27017);
			System.out.println("1,몽고db 프로그램에 연결성공");
			
			MongoDatabase database = client.getDatabase("shop2");
			System.out.println("2.shop2 db로 연결 성공.");
			
			MongoCollection<Document> collection = database.getCollection("member");
			System.out.println("3.member 컬렉션에 연결성공");
	
			Document filter = new Document();
			filter.append("id", "sunday");
			
			Bson set = Updates.set("name", "aa");
			Bson set2 = Updates.set("tel", "win010");
			
			ArrayList<Bson> list = new ArrayList<Bson>();
			list.add(set);
			list.add(set2);
			
			Bson setts = Updates.combine(list);
			
			collection.updateOne(filter, setts);
			System.out.println("4.member 컬렉션에 update성공.");
	}

}
