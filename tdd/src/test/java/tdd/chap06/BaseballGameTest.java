package tdd.chap06;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BaseballGameTest {

    @ParameterizedTest
    @CsvSource(value = {"123,0,0", "456,3,0"}, delimiter = ',')
    void testScoreFor456Input(String answer, int strikeScore, int ballScore) {
        //given
        BaseballGame game = new BaseballGame(answer);

        //when
        Score score = game.guess("456");

        //then
        assertThat(score.strikes()).isEqualTo(strikeScore);
        assertThat(score.balls()).isEqualTo(ballScore);
    }

    @Test
    void gameWithDuplicateNumberThenFail () {
        assertThrows(IllegalArgumentException.class, ()->{
            new BaseballGame("110");
        });
    }
}