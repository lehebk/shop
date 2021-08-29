package book.shop.Repository;

import book.shop.Entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findByName(String name);

    List<Member> findByAge(int age);
}
