CREATE TABLE member2(
	id varchar2(100),
	pw varchar2(100),
	name varchar2(100),
	tel varchar2(100)
)

CREATE TABLE BBS2(
	id varchar2(100),
	title varchar2(100),
	content varchar2(100),
	writer varchar2(100)
)

CREATE TABLE "HR"."PRODUCT2" 
   (	"ID" VARCHAR2(100), 
	"NAME" VARCHAR2(100), 
	"CONTENT" VARCHAR2(100), 
	"PRICE" NUMBER(38,0)
   ) 
   
   
   CREATE TABLE "HR"."MEMBER3" 
   (	"ID" VARCHAR2(100), 
	"PW" VARCHAR2(100), 
	"NAME" VARCHAR2(100), 
	"TEL" VARCHAR2(100)
   ) 
   
   CREATE TABLE "HR"."hobby" 
   (	"hobbyid" VARCHAR2(100), 
	"content" VARCHAR2(100), 
	"location" VARCHAR2(100) 
   ) 
   CREATE TABLE "HR"."hobby2" 
   (	"hobbyid" VARCHAR2(100), 
	"content" VARCHAR2(100), 
	"location" VARCHAR2(100)
   )
   
INSERT INTO "hobby2" VALUEs ('100','run','seoul') 

INSERT INTO "hobby2" VALUES ('200','book','busan') 

SELECT * FROM "hobby2" 

SELECT "content"  FROM "hobby2" 

SELECT "location" ,"content"  FROM "hobby2" 

   
INSERT INTO "member" VALUES('park','1234','park','011')

INSERT INTO "member" VALUES('apple','1111','apple','011')

INSERT INTO "member" VALUES('ice','2222','ice','012')

INSERT INTO "member" VALUES('melon','3333','melon','013')

SELECT * FROM "member"

SELECT ID  FROM "member"

SELECT ID ,PW  FROM "member"



