package chanjarster.tomcat.valves;

public class Constants {
  public static final String Package = "chanjarster.tomcat.valves";

  //Constants for the AccessLogValve class
  public static final class MongoAccessLog {
      public static final String DEFAULT_ALIAS = "default";
      public static final String DEFAULT_PATTERN = "%a %B %l %m %s %S %t %U %T %P %{Referer}i %{User-Agent}i";
  }
  
}
