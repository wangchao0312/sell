package com.imooc.utils.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by 王超
 * 2019 05 19
 */
public class Date2LongSerializer extends JsonSerializer<Date> {

    @Override
    public void serialize(Date date, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        //jsonGenerator.writeNumber(date.getTime() / 1000);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("MM-dd-yyyy");
        jsonGenerator.writeString(simpleDateFormat.format(date));
    }
}
