package hello.servlet.web.fontcontroller.v2;

import hello.servlet.web.fontcontroller.MyView;
import hello.servlet.web.fontcontroller.v2.controller.MemberFormControllerV2;
import hello.servlet.web.fontcontroller.v2.controller.MemberListControllerV2;
import hello.servlet.web.fontcontroller.v2.controller.MemberSaveControllerV2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Imaspear on 2022-01-10
 * Blog : https://imspear.tistory.com/
 * Github : https://github.com/Imaspear
 */
@WebServlet(name = "frontControllerServletV2", urlPatterns = "/front-controller/v2/*")
public class FrontControllerServletV2 extends HttpServlet {

    Map<String, ControllerV2> controllerV2Map = new HashMap<>();

    public FrontControllerServletV2() {
        controllerV2Map.put("/front-controller/v2/members/new-form", new MemberFormControllerV2());
        controllerV2Map.put("/front-controller/v2/members/save", new MemberSaveControllerV2());
        controllerV2Map.put("/front-controller/v2/members", new MemberListControllerV2());
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("FrontControllerServletV2.service");

        String requestURI = request.getRequestURI();
        ControllerV2 controllerV2 = controllerV2Map.get(requestURI);
        if (controllerV2 == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        MyView process = controllerV2.process(request, response);
        process.render(request, response);
    }
}
