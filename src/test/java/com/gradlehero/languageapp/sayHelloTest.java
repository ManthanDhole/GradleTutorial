package com.gradlehero.languageapp;
import org.junit.jupiter.api.Test;
import com.gradlehero.languageapp.sayHello;
import java.io.IOException;

public class sayHelloTest {
  @Test
  public void testSayHello() throws IOException {
    sayHello.main(new String[]{"en"});
  }
}
