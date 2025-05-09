package com.labs.lab308.repository;

import com.labs.lab308.model.Member;
import com.labs.lab308.model.MemberStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

    List<Member> findByStatus(MemberStatus status);

    List<Member> findByRenewalDateBefore(LocalDate date);
}
