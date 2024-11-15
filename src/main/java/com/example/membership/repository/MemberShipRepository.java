package com.example.membership.repository;

import com.example.membership.entity.MemberShip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberShipRepository extends JpaRepository<MemberShip, Long> {
    // findById 는 있다.

    // 하지만 session값에는 email을 등록하니 그 email값으로 찾는 것이 필요하다
    // 그래서 email을 테이블을 만들 때 유니크로 만들었고 유일하게 만들었다 pk를 대체해서
    // 사용하기 위해서 유니크 + notnull 해서 만들었다.

    public MemberShip findByEmail (String email);
    // select * from user where email = :email
}
