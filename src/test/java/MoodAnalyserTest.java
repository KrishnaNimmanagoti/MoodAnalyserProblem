import com.bridgelabz.moodanalyserproblem.MoodAnalyser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {

    MoodAnalyser mood;

    @Test
    public void testSadMood(){

        mood = new MoodAnalyser(null);

        System.out.println(mood.analyseMood());

    }

//    @Test
//    public void testHappyMood(){
//
//        mood = new MoodAnalyser("I am in Happy mood");
//
//        System.out.println(mood.analyseMood());
//
//    }

}
