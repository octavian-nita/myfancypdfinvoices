package eu.objectivum;

import javax.servlet.http.*;
import java.io.IOException;

public class MyFirstServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("text/html; charset=UTF-8");
    response.getWriter().print("""
      <html>
        <head>
          <meta charset="utf-8">
          <meta name="viewport" content="width=device-width, initial-scale=1">
          <title>Page Title</title>
        </head>
        <body>
          <h1>Hello World</h1>
          <p>This is my very first, embedded Tomcat, HTML page!</p>
        </body>
      </html>
      """);
  }
}
