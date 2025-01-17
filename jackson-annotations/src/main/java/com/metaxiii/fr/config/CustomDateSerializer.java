package com.metaxiii.fr.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDateSerializer extends StdSerializer<Date> {

  private final SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

  public CustomDateSerializer() {
    this(null);
  }

  public CustomDateSerializer(Class<Date> t) {
    super(t);
  }

  @Override
  public void serialize(
    final Date date,
    final JsonGenerator jsonGenerator,
    final SerializerProvider serializerProvider
  ) throws IOException {
    jsonGenerator.writeString(formatter.format(date));
  }
}
