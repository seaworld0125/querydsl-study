package study.querydsl.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * packageName    : study.querydsl.entity
 * fileName       : Hello
 * author         : Kim
 * date           : 2022-12-01
 */
@Entity
@Getter @Setter
public class Hello {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
