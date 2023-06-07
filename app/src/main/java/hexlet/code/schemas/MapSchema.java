package hexlet.code.schemas;

import java.util.Map;

public class MapSchema extends BaseSchema{
    void required(){}
    void sizeof(int size){}
    void shape(Map<String, BaseSchema> schemas){}
}
