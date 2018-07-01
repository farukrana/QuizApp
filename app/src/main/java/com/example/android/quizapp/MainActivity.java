package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * This app Tests your knowledge about The African Continent
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score;

    /**
     * The methods below and 1 to the score if the correct answer to the question is given.
     */

    public void questionOneScore(){
        RadioButton answerOne = findViewById(R.id.q1_answer_two);
        boolean answer = answerOne.isChecked();

        if (answer){
            score += 1;
        }
    }
    public void questionTwoScore(){
        RadioButton answerTwo = findViewById(R.id.q2_answer_one);
        boolean answer = answerTwo.isChecked();

        if (answer){
            score += 1;
        }
    }
    public void questionThreeScore(){
        RadioButton answerThree = findViewById(R.id.q3_answer_three);
        boolean answer = answerThree.isChecked();

        if (answer){
            score += 1;
        }
    }
    public void questionFourScore(){
        RadioButton answerFour = findViewById(R.id.q4_answer_one);
        boolean answer = answerFour.isChecked();

        if (answer){
            score += 1;
        }
    }
    public void questionFiveScore(){
        RadioButton answerFive = findViewById(R.id.q5_answer_three);
        boolean answer = answerFive.isChecked();

        if (answer){
            score += 1;
        }
    }
    public void questionSixScore(){
        RadioButton answerSix = findViewById(R.id.q6_answer_two);
        boolean answer = answerSix.isChecked();

        if (answer){
            score += 1;
        }
    }
    public void questionSevenScore(){
        RadioButton answerSeven = findViewById(R.id.q7_answer_three);
        boolean answer = answerSeven.isChecked();

        if (answer){
            score += 1;
        }
    }

    /**
     * This particular method allows the user to enter multiple correct answers by checking certain check boxes.
     */

    public void questionEightScore(){
        CheckBox firstChoice = findViewById(R.id.q8_check_one);
        boolean firstRightAnswer = firstChoice.isChecked();

        CheckBox secondChoice = findViewById(R.id.q8_check_two);
        boolean secondRightAnswer = secondChoice.isChecked();

        CheckBox thirdChoice = findViewById(R.id.q8_check_three);
        boolean thirdRightAnswer = thirdChoice.isChecked();

        CheckBox fourthChoice = findViewById(R.id.q8_check_four);
        boolean fourthRightAnswer = fourthChoice.isChecked();

        CheckBox fifthChoice = findViewById(R.id.q8_check_five);
        boolean fifthRightAnswer = fifthChoice.isChecked();

        if (!firstRightAnswer && !secondRightAnswer && thirdRightAnswer && !fourthRightAnswer && fifthRightAnswer){
            score += 1;
        }
    }

    /**
     * This method is called when the submit button is clicked.
     */

    public void viewScore(View view){
        EditText typeName = findViewById(R.id.your_name);
        String name = typeName.getText().toString();
        questionOneScore();
        questionTwoScore();
        questionThreeScore();
        questionFourScore();
        questionFiveScore();
        questionSixScore();
        questionSevenScore();
        questionEightScore();

        if (score <= 2){
            Toast.makeText(this, name +", your score is: " + score +" of 8. Better luck next time!", Toast.LENGTH_LONG).show();
        }else if (score <= 5){
            Toast.makeText(this, name + ", your score is: " + score + " of 8. Good try but still more to learn!", Toast.LENGTH_LONG).show();
        }else if(score > 5){
            Toast.makeText(this, name+ ", your score is: " + score + " of 8. Well done,  you know Africa pretty well!", Toast.LENGTH_LONG).show();
        }

        score = 0;
    }

    /**
     * This method is called when the clear button is clicked.
     * It unchecked all the radio buttons and checkboxes.
     */
    public void uncheckAll(View view){
        RadioGroup groupOne = findViewById(R.id.question_one);
        groupOne.clearCheck();

        RadioGroup groupTwo = findViewById(R.id.question_two);
        groupTwo.clearCheck();

        RadioGroup groupThree = findViewById(R.id.question_three);
        groupThree.clearCheck();

        RadioGroup groupFour = findViewById(R.id.question_four);
        groupFour.clearCheck();

        RadioGroup groupFive = findViewById(R.id.question_five);
        groupFive.clearCheck();

        RadioGroup groupSix = findViewById(R.id.question_six);
        groupSix.clearCheck();

        RadioGroup groupSeven = findViewById(R.id.question_seven);
        groupSeven.clearCheck();

        CheckBox checkBoxOne = findViewById(R.id.q8_check_one);
        CheckBox checkBoxTwo = findViewById(R.id.q8_check_two);
        CheckBox checkBoxThree = findViewById(R.id.q8_check_three);
        CheckBox checkBoxFour = findViewById(R.id.q8_check_four);
        CheckBox checkBoxFive = findViewById(R.id.q8_check_five);

        if (checkBoxOne.isChecked()){
            checkBoxOne.toggle();
        }
        if(checkBoxTwo.isChecked()){
            checkBoxTwo.toggle();
        }
        if(checkBoxThree.isChecked()){
            checkBoxThree.toggle();
        }
        if(checkBoxFour.isChecked()){
            checkBoxFour.toggle();
        }
        if (checkBoxFive.isChecked()){
            checkBoxFive.toggle();
        }

    }

}
