package hello.servlet.domain.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Imaspear on 2022-01-09
 * Blog : https://imspear.tistory.com/
 * Github : https://github.com/Imaspear
 */

// JUnit 4는 public 으로 선언해야 하는데 JUnit5는 안해도 괜찮다.
class MemberRepositoryTest {
    MemberRepository memberRepository = MemberRepository.getInstance();

    @AfterEach
    void tearDown() {
        memberRepository.clearStrore();
    }

    @Test
    @DisplayName("member 저장")
    void save() throws Exception{
        //given
        Member member = new Member("hello", 20);
        //when
        Member saveMember = memberRepository.save(member);
        //then
        Member memberRepositoryById = memberRepository.findById(saveMember.getId());
        Assertions.assertThat(memberRepositoryById).isEqualTo(saveMember);
    }

    @Test
    @DisplayName("Member findAll test")
    public void findAll() throws Exception{
        //given
        Member member1 = new Member("member1", 20);
        Member member2 = new Member("member2", 20);

        memberRepository.save(member1);
        memberRepository.save(member2);
        //when
        List<Member> repositoryAll = memberRepository.findAll();
        //then
        Assertions.assertThat(repositoryAll.size()).isEqualTo(2);
    }
}