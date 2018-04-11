package com.example.android.quizapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /* Question 1 */
    private RadioButton question1_choice_vishal;
    /* Question 2 */
    private RadioButton question2_choice_mv;
    /* Question 3 */
    private CheckBox question3_choice1_sdcar;
    private CheckBox question3_choice2_data_sciences;
    private CheckBox question3_choice3_dm;
    private CheckBox question3_choice4_vr;
    private CheckBox question3_choice5_nontech;
    private CheckBox question3_choice6_deeplearn;
    private CheckBox question3_choice7_webdev;
    /* Question 4 */
    private EditText question4_answer;
    /* Question 5 */
    private RadioButton question5_choice_nano;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Hide the keyboard
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);
    }

    /* This method is called when the grade quiz button is clicked */

    public void gradeQuiz(View view) {
        CharSequence resultsDisplay;
        int answer1_score;
        int answer2_score;
        int answer3_score;
        int answer4_score;
        int answer5_score;
        int final_score;

        //
        /* Question 1 - Answer: Vishal Makhijani  */
        /* ----------------------- */
        Boolean answer1;

        question1_choice_vishal = this.findViewById(R.id.question1_radio_vishal);
        answer1 = question1_choice_vishal.isChecked();
        if (answer1) {
            answer1_score = 1;
        } else {
            answer1_score = 0;
        }

        /* ------------------------- */
        /* Question 2 - Answer: Mountain View, CA */
        /* ------------------------- */
        // Boolean answer2;

        question2_choice_mv = this.findViewById(R.id.mountain_view);
        answer1 = question2_choice_mv.isChecked();
        if (answer1) {
            answer2_score = 1;
        } else {
            answer2_score = 0;
        }

        /* -------------------------------------------------------- */
        /* Question 3  - Answer: All options listed. */
        /* -------------------------------------------------------- */

        Boolean answer3_choice1;
        Boolean answer3_choice2;
        Boolean answer3_choice3;
        Boolean answer3_choice4;
        Boolean answer3_choice5;
        Boolean answer3_choice6;
        Boolean answer3_choice7;
        question3_choice1_sdcar = this.findViewById(R.id.question3_choice1_sdcar);
        question3_choice2_data_sciences = this.findViewById(R.id.question3_choice2_data_sciences);
        question3_choice3_dm = this.findViewById(R.id.question3_choice3_dm);
        question3_choice4_vr = this.findViewById(R.id.question3_choice4_vr);
        question3_choice5_nontech = this.findViewById(R.id.question3_choice5_nontech);
        question3_choice6_deeplearn = this.findViewById(R.id.question3_choice6_deeplearn);
        question3_choice7_webdev = this.findViewById(R.id.question3_choice7_webdev);
        answer3_choice1 = question3_choice1_sdcar.isChecked();
        answer3_choice2 = question3_choice2_data_sciences.isChecked();
        answer3_choice3 = question3_choice3_dm.isChecked();
        answer3_choice4 = question3_choice4_vr.isChecked();
        answer3_choice5 = question3_choice5_nontech.isChecked();
        answer3_choice6 = question3_choice6_deeplearn.isChecked();
        answer3_choice7 = question3_choice7_webdev.isChecked();
        if (answer3_choice1 && answer3_choice2 && answer3_choice3 && !answer3_choice4 && answer3_choice5 && !answer3_choice6 && answer3_choice7) {
            answer3_score = 1;
        } else {
            answer3_score = 0;
        }

        /* ------------------------------------ */
        /* Question 4 - Answer is "Slack" */
        /* ------------------------------------ */
        String answer4;

        question4_answer = this.findViewById(R.id.question4_answer);
        answer4 = question4_answer.getText().toString().toLowerCase();
        if (answer4.equals("Slack")) {
            answer4_score = 1;
        } else {
            answer4_score = 0;
        }

        /* -------------------------------- */
        /* Question 5 - Answer: Nanodegree */
        /* -------------------------------- */
        Boolean answer5;

        question5_choice_nano = this.findViewById(R.id.question5_choice_nano);
        answer5 = question5_choice_nano.isChecked();
        if (answer5) {
            answer5_score = 1;
        } else {
            answer5_score = 0;
        }

        /* ------------------------------- */
        /* Grade and display final score! */
        /* ------------------------------- */

        final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score;

        if (final_score == 5) {
            resultsDisplay = "NICE! You got 5 out of 5";
        } else {
            resultsDisplay = "Try again... Only " + final_score + " out of 5";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();

    }

}