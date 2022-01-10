package hello.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Imaspear on 2022-01-09
 * Blog : https://imspear.tistory.com/
 * Github : https://github.com/Imaspear
 */

/**
 * 동시성 문제가 고려되어 있지 않음, 실무에서는 ConcurrentHashMap, AtomicLong 사용 고려
 */
public class MemberRepository {

    private Map<Long, Member> stroe = new HashMap<>();
    private static long sequence = 0L;

    private static final MemberRepository instance = new MemberRepository();

    public static MemberRepository getInstance() {
        return instance;
    }

    private MemberRepository(){
    }

    public Member save(Member member){
        member.setId(++sequence);
        stroe.put(member.getId(), member);
        return member;
    }

    public Member findById(Long id){
        return stroe.get(id);
    }

    public List<Member> findAll() {
//      이렇게 하면 store의 value list를 건들지 않는다.
//       store를 안전하게 보호
        return new ArrayList<>(stroe.values());
    }

    public void clearStrore() {
        stroe.clear();
    }
}
