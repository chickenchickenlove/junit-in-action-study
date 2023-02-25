package org.example.mockitotest;

import java.util.HashMap;
import java.util.Map;

public class AshMockRepository {

    private Map<String, String> store = new HashMap<>();
    private boolean isFirst = true;


    public String getData(String k) {

        if (isFirst) {
            store.put("a", "real");
            store.put("b", "real");
            isFirst = false;
        }

        return store.get(k);
    }


}
