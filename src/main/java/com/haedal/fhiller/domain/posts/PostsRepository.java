package com.haedal.fhiller.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository를 통해서 Posts를 사용하는 PostsRepository 인터페이스.
public interface PostsRepository extends JpaRepository<Posts, Long> {

}
