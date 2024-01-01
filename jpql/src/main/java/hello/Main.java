package hello;

import hello.jpql.Member;
import jakarta.persistence.*;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        Member member = new Member();
        member.setUsername("member1");

        member.setAge(10);
        em.persist(member);

        TypedQuery<Member> query = em.createQuery("select m from Member m", Member.class);
        Query query2 = em.createQuery("select m.username, m.age from Member  m");
    }
}
