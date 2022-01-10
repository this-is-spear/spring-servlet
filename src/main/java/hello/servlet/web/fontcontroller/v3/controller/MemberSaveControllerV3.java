package hello.servlet.web.fontcontroller.v3.controller;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import hello.servlet.web.fontcontroller.ModelView;
import hello.servlet.web.fontcontroller.v3.ControllerV3;

import java.util.Map;

/**
 * Created by Imaspear on 2022-01-10
 * Blog : https://imspear.tistory.com/
 * Github : https://github.com/Imaspear
 */
public class MemberSaveControllerV3 implements ControllerV3 {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> map) {
        String username = map.get("username");
        int age = Integer.parseInt(map.get("age"));

        Member member = new Member(username, age);
        memberRepository.save(member);
        ModelView modelView = new ModelView("save-result");
        modelView.getModel().put("member", member);
        return modelView;
    }
}
