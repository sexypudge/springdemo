package com.example.demo.service;

import com.example.demo.model.domain.QUser;
import com.example.demo.repository.UserRepository;
import com.querydsl.core.types.Ops;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.core.types.dsl.Expressions;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.querydsl.jpa.impl.JPAUpdateClause;
import com.querydsl.sql.SQLExpressions;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.Date;
import java.util.Objects;

@Transactional
@Service
public class UserService {

    @Autowired
    private StandardEnvironment standardEnvironment;

    @Autowired
    Environment environment;

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private UserRepository userRepository;

    public long updateName(){
        QUser qUser = QUser.user;
        JPAQueryFactory queryFactory = new JPAQueryFactory(entityManager);
//        BooleanExpression booleanExpression = Expressions.
//                dateTimeOperation(
//                    Date.class,
//                    Ops.DateTimeOps.ADD_DAYS,
//                    qUser.createdAt,
//    //                        Expressions.asNumber(+ Integer.parseInt(Objects.requireNonNull(environment.getProperty("paynow.payez.expired_date")))))
//                    Expressions.asNumber(+ 1))
//                .gt(Expressions.currentTimestamp());
        LocalDateTime today = new LocalDateTime();
//        BooleanExpression booleanExpression2 = qUser.createdAt.after(today.minusDays(1));
        BooleanExpression booleanExpression2 = SQLExpressions.addDays(qUser.createdAt, 1).before(today);
        return queryFactory
                .update(qUser)
                .set(qUser.name, "luongnv")
                .where(booleanExpression2)
                .execute();
    }

    public int updateName(String name){
        return userRepository.updateName(name, 1);
    }

}
