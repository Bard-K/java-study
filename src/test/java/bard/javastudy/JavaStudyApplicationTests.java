package bard.javastudy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.Function;

@SpringBootTest
class JavaStudyApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void lambdaMethodReference() {

        Function<Integer, int[]> f = x -> new int[x]; // 람다식
        Function<Integer, int[]> f2 = int[]::new; // 메서드 참조
    }

    @Test
    void stream() {

    }

}
