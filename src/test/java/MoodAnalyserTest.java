import com.bridgelabz.moodanalyserproblem.MoodAnalyser;
import com.bridgelabz.moodanalyserproblem.MoodAnalyserException;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    MoodAnalyser mood;

    @Test
    public void testSadMood() throws MoodAnalyserException {

        mood = new MoodAnalyser("EMPTY");

        System.out.println(mood.analyseMood());

    }
}

