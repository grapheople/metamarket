package com.grapheople.metamarket.controller;

import com.grapheople.metamarket.model.entity.Member;
import com.grapheople.metamarket.model.param.MemberParam;
import com.grapheople.metamarket.repository.MemberRepository;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 지성인 on 2021-11-26.
 */
@RequestMapping("/api/v1/member")
@RestController
@Tag(name = "멤버관리 API")
@AllArgsConstructor
@Slf4j
public class MemberController {
    private final MemberRepository memberRepository;

    @GetMapping
    public Page<Member> getMembers(@RequestParam(defaultValue = "0") int offset, @RequestParam(defaultValue = "10") int size) {
        log.info("test");
        return memberRepository.findAll(PageRequest.of(offset, size, Sort.by("id").descending()));
    }

    @PostMapping("/")
    public Member createMember(@ModelAttribute MemberParam param) {
        Member member = new Member();
        member.setNickname(param.getNickName());
        member.setEmail(param.getEmail());
        member.setPassword(param.getPassword());
        return memberRepository.save(member);
    }

    @GetMapping("{memberId}")
    public Member getMember(@PathVariable Long memberId) throws Exception {
        return memberRepository.findById(memberId).orElseThrow(() -> new Exception("Not found member"));
    }
}
