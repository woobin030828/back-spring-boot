package com.app.dependency.qualifier;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
public class Vips implements Resturant{

    @Override
    public int getPrice() {
        return 5000;
    }

    @Override
    public boolean getSelfBar() {
        return true;
    }
}
