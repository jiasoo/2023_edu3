package com.ict.edu3.mapper.members;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ict.edu3.model.members.MemberVO;

@Mapper
public interface Member_Mapper {
    // 해당 내용이 resources/mapper/member.xml을 반영하고 전달하는 역할을 한다.
    // springboot 에서 MemberDAO에 대신 사용되는것
    public List<MemberVO> getList();
    public int getIDCnt(String id);
    public MemberVO getMemberOne(String id);
    int getMemberAdd(MemberVO vo);
}
