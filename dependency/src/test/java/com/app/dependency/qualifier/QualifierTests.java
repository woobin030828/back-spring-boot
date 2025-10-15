package com.app.dependency.qualifier;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class QualifierTests {

    @Autowired
    @Qualifier("laptop")
    private Computer computer;

    @Autowired
    private DeskTop deskTop;

    @Autowired
    private Resturant resturant;

    @Test //단위 테스트, 메서드 단위
    public void computerTest01(){
        log.info("{}", computer.getScreenSize());
    }

    @Test
    public void resturantTest01(){
        log.info("결과: {}", resturant.getPrice());
    }

    @Test
    public void resturantTest02(){
        log.info("결과: {}", resturant.getSelfBar());
    }

}
