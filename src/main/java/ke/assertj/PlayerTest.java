package ke.assertj;

import org.assertj.core.api.SoftAssertions;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest {
    @Test
    public void checkAge(){
       Player p =  new Player("Oleg", 30);
        assertThat(p.getAge()).overridingErrorMessage("error>>>").isEqualTo(30);
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(p.getAge()).as("Age equals").isEqualTo(30);
        softly.assertAll();
    }

    @Test
    public void checkName(){
        Player p =  new Player("Oleg", 30);
        assertThat(p.getAge()).overridingErrorMessage("error>>>").isEqualTo(30);
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat(p.getName()).as("Verify name ").isEqualTo("Oleg1");
        softly.assertThat(p.getAge()).as("Verify age ").isEqualTo("Oleg1");
        softly.assertAll();
    }

    @Test
    public void checkNameSoftly(){
        Player p =  new Player("Oleg", 30);
        assertThat(p.getAge()).overridingErrorMessage("error>>>").isEqualTo(30);
        SoftAssertions.assertSoftly(softly -> {

        softly.assertThat(p.getName()).as("Verify name ").isEqualTo("Oleg1");
        softly.assertThat(p.getAge()).as("Verify age ").isEqualTo("Oleg1");
        });
    }

    @Test
    public void checkNameStartWith(){
        Player p =  new Player("Oleg", 30);
        assertThat(p.getAge()).overridingErrorMessage("error>>>").isEqualTo(30);
        SoftAssertions.assertSoftly(softly -> {

            softly.assertThat(p.getName()).startsWith("O").isEqualTo("Oleg1");
            softly.assertThat(p.getAge()).as("Verify age ").isEqualTo(30);
        });
    }
}
