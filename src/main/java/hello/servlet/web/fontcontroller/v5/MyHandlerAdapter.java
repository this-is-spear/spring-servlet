package hello.servlet.web.fontcontroller.v5;

import hello.servlet.web.fontcontroller.ModelView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Imaspear on 2022-01-10
 * Blog : https://imspear.tistory.com/
 * Github : https://github.com/Imaspear
 */
public interface MyHandlerAdapter {
    boolean supports(Object handler);
    ModelView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException;
}
