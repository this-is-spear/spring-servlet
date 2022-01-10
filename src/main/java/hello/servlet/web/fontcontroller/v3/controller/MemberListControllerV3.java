package hello.servlet.web.fontcontroller.v3.controller;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import hello.servlet.web.fontcontroller.ModelView;
import hello.servlet.web.fontcontroller.v3.ControllerV3;

import java.util.List;
import java.util.Map;

/**
 * Created by Imaspear on 2022-01-10
 * Blog : https://imspear.tistory.com/
 * Github : https://github.com/Imaspear
 */
public class MemberListControllerV3 implements ControllerV3 {

    MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> map) {
        List<Member> memberList = memberRepository.findAll();
        ModelView modelView = new ModelView("members");
        modelView.getModel().put("members", memberList);
        return modelView;
    }
}
