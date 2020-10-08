package common;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class OperationMap {
    private static final Map<String, Operation> commandOperationMap;

    static {
        Map<String,Operation> staticMap = new HashMap<>();
        staticMap.put("+",Operation.ADDITION);
        staticMap.put("-",Operation.SUBTRACTION);
        staticMap.put("*",Operation.MULTIPLICATION);
        staticMap.put("/",Operation.DIVISION);
        commandOperationMap = Collections.unmodifiableMap(staticMap);
    }

    public static Map<String, Operation> getCommandOperationMap() {
        return commandOperationMap;
    }
}
