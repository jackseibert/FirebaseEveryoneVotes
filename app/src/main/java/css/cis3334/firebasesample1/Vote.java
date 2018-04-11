package css.cis3334.firebasesample1;

/**
 * Created by cssuser on 4/9/2017.
 */

public class Vote {
    String answerText;
    Integer selection;

    public Vote() {
    }

    public Vote(String answerText, Integer selection) {
        this.answerText = answerText;
        this.selection = selection;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public Integer getSelection() {
        return selection;
    }

    public void setSelection(Integer selection) {
        this.selection = selection;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "answerText='" + answerText + '\'' +
                ", selection=" + selection +
                '}';
    }
}
