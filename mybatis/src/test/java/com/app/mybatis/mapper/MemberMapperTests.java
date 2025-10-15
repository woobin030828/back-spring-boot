package com.app.mybatis.mapper;

import com.app.mybatis.domain.MemberVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MemberMapperTests {
    @Autowired
    private MemberMapper memberMapper;

    @Test
    public void test() {
        MemberVO memberVO = new MemberVO();
        memberVO.setMemberName("vb");
        memberVO.setMemberPassword("1234");
        memberVO.setMemberEmail("fpqk33@naver.com");
        memberMapper.insert(memberVO);
    }

    @Test
    public void testSelectOne() {

        MemberVO inputMemberVO = new MemberVO();

        inputMemberVO.setMemberEmail("fpqk33@naver.com");
        inputMemberVO.setMemberPassword("1234");

        MemberVO memberVO = memberMapper.selectOne(inputMemberVO);
        log.info("memberVO: {}", memberVO);
    }
}
