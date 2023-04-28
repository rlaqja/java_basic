package com.multi.mongoDB3;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBTest2_delete2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			MongoClient client = new MongoClient("localhost",27017);
			System.out.println("1,몽고db 프로그램에 연결성공");
			
			MongoDatabase database = client.getDatabase("shop2");
			System.out.println("2.shop2 db로 연결 성공.");
			
			MongoCollection<Document> collection = database.getCollection("member");
			System.out.println("3.member 컬렉션에 연결성공");
	
			//삭제할 조건을 json(document)로 만들기
			Document filter = new Document();
			filter.append("pw", "1234");
			
			collection.deleteMany(filter);
			client.close();
			System.out.println("4번. deleteMany 성공~");
			
	}

}
