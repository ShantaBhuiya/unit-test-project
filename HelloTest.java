package geico.insurance.auto.quote;

import geico.insurance.auto.quote.quote.Hello;
import org.junit.jupiter.api.*;
import org.testng.asserts.Assertion;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class HelloTest {

//private static Hello hello;
//@BeforeEach
//void setUp(){
//     hello = new Hello();
//}


    @Test
    @DisplayName("This is Morning test")
    @Order(1)
     void goodMorningTest(){
        Hello hello = new Hello();
        Assertions.assertEquals("Hello Good Morning Saturday", hello.goodMorning());
    }
    @Disabled
    @Test
    @DisplayName("This is Afternoon test")
    @Order(2)
    void goodAfternoonTest(){
        Hello hello = new Hello();
        Assertions.assertEquals("Hello Good Afternoon Saturday", hello.goodAfternoon());
    }

    @Test
    @DisplayName("This is Evening test")
    @Order(3)
    void goodEveningTest(){
        Hello hello = new Hello();
        Assertions.assertEquals("Hello Good Evening Saturday", hello.goodEvening());
    }

    @Test
    @DisplayName("This is Night test")
    @Order(4)
    void goodNightTest(){
        Hello hello = new Hello();
        Assertions.assertEquals("Hello Good Night Saturday", hello.goodNight());
    }


}
