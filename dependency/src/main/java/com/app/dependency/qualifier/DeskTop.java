package com.app.dependency.qualifier;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component @Data // IOC 컨테이너에 계속 등록 중인 것
public class DeskTop implements Computer{
    @Override
    public int getScreenSize() {
        return 2560;
    }
}
