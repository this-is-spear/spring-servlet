package hello.servlet.web.fontcontroller.v2;

import hello.servlet.web.fontcontroller.MyView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Imaspear on 2022-01-10
 * Blog : https://imspear.tistory.com/
 * Github : https://github.com/Imaspear
 */
public interface ControllerV2 {
    MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
