CREATE TABLE "HR"."BOARD" 
   (	"BOARDNO" NUMBER(38,0), 
	"TITLE" VARCHAR2(100), 
	"CONTENTS" VARCHAR2(100), 
	"WRITER" VARCHAR2(100), 
	"WRITEDATE" DATE, 
	"RECOMMEND" NUMBER(38,0), 
	"VIEWCOUNT" NUMBER(38,0)
   )
   
DROP TABLE RECOMMEND 

CREATE TABLE RECOMMEND (
 	"re_no" NUMBER(38.0),
 	"title" varchar2(100),
 	"content" varchar2(100),
 	"writer" varchar2(100)
 )
 
