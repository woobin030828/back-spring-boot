package com.app.dependency.qualifier;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Data
@Primary
public class Outback implements Resturant{

    @Override
    public int getPrice() {
        return 100000;
    }

    @Override
    public boolean getSelfBar() {
        return true;
    }

}
