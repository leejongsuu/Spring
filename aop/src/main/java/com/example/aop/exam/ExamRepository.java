package com.example.aop.exam;

import com.example.aop.exam.annotation.Retry;
import com.example.aop.exam.annotation.Trace;
import org.springframework.stereotype.Repository;

@Repository
public class ExamRepository {

    private static int seq = 0;

    /**
     * 5번중 1번 실패하는 요청
     */
    @Trace
    @Retry(4)
    public String save(String ItemId) {
        seq++;
        if (seq % 5 == 0) {
            throw new IllegalStateException("예외 발생");
        }
        return "ok";
    }
}
