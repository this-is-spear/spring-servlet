package hello.servlet.web.fontcontroller.v4.controller;

import hello.servlet.web.fontcontroller.v4.ControllerV4;

import java.util.Map;

/**
 * Created by Imaspear on 2022-01-10
 * Blog : https://imspear.tistory.com/
 * Github : https://github.com/Imaspear
 */
public class MemberFormControllerV4 implements ControllerV4 {

    @Override
    public String process(Map<String, String> paramMap, Map<String, Object> mode) {
        return "new-form";
    }
}
