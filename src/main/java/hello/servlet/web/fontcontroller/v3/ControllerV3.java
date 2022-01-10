package hello.servlet.web.fontcontroller.v3;

import hello.servlet.web.fontcontroller.ModelView;

import java.util.Map;

/**
 * Created by Imaspear on 2022-01-10
 * Blog : https://imspear.tistory.com/
 * Github : https://github.com/Imaspear
 */
public interface ControllerV3 {
    ModelView process(Map<String, String> map);
}
