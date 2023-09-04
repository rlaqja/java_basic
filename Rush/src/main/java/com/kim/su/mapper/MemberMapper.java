package com.kim.su.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.kim.su.RushVO;

@Mapper
public interface MemberMapper {
	
	@Select("SELECT * FROM member WHERE id = ${id}")
	RushVO getMember(@Param("id") String id);
	
	@Select("SELECT * FROM member")
	List<RushVO> getMemberList();
	
	@Insert("INSERT INTO member VALUE (${id}, ${phone} , ${name} ,${age})")
	int insertMember(@Param("id")String id,@Param("phone") String phone,@Param("name") String name,@Param("age")int age);
	
	@Update("UPDATE member SET name=${name}, phone=${phone}, age=${age} WHERE id = ${id}")
	int updatemember(@Param("id")String id,@Param("phone") String phone,@Param("name") String name,@Param("age")int age);
	
	@Delete("DELETE FROM member WHERE id = ${id}")
	int deletemember(@Param("id")String id);
	
}
