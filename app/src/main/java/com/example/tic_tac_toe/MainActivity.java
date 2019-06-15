/*
@author - Karun Dawadi
The images were created using Paint 3d
 */
package com.example.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Special condition for star
    boolean [][] specialCondition = {{false,false,false}
            ,{false,false,false},
            {false,false,false}};
    // Setting the ImageView as global variable
    ImageView theImageWeAreLookingFor;
    // Defining which user entered which value in the Array
    // True is for player one and false is for player two
    boolean [][] userState = {{false,false,false}
            ,{false,false,false},
            {false,false,false}};
    //Defining an empty 2 dimensional array so that the when the user selects a space then the value is updated
    int [][] combinations = {{0,0,0},
            {0,0,0},
            {0,0,0}};
    // Defining current player
    // If true the user is circle if not the user is the star
    boolean currentUser = true;
    //Counts the number of times the app is runned
    int counter = 0;
    public void theGameMethod(View view){
        // This makes the image view defined as view it self and the user is viewing the image
        boolean conditionForDraw = false;
        theImageWeAreLookingFor = (ImageView) view;
        switch (view.getId()){
            case R.id.i0:
                if(combinations[0][0]==0){
                    combinations[0][0]=1;
                    counter++;
                    if(currentUser){
                        userState[0][0]= true;
                        theImageWeAreLookingFor.setImageResource(R.drawable.circle);
                        theImageWeAreLookingFor.animate().setDuration(2000);
                        currentUser = false;
                    }
                    else{
                        userState[0][0]= false;
                        specialCondition[0][0]= true;
                        theImageWeAreLookingFor.setImageResource(R.drawable.star);
                        theImageWeAreLookingFor.animate().rotation(360f).setDuration(2000);
                        currentUser = true;
                    }}
                else{
                    Toast.makeText(MainActivity.this,"Already clicked",Toast.LENGTH_SHORT).show();
                    break;
                }
                break;

            case R.id.i1:
                if(combinations[0][1]==0){
                    combinations[0][1]=1;
                    counter++;
                    if(currentUser){
                        userState[0][1]= true;
                        theImageWeAreLookingFor.setImageResource(R.drawable.circle);
                        theImageWeAreLookingFor.animate().setDuration(2000);
                        currentUser = false;
                    }
                    else{
                        userState[0][1]= false;
                        specialCondition[0][1]= true;
                        theImageWeAreLookingFor.setImageResource(R.drawable.star);
                        theImageWeAreLookingFor.animate().rotation(360f).setDuration(2000);
                        currentUser = true;
                    }}
                else{
                    Toast.makeText(MainActivity.this,"Already clicked",Toast.LENGTH_SHORT).show();
                    break;
                }
                break;



            case R.id.i2:
                if(combinations[0][2]==0){
                    combinations[0][2]=1;
                    counter++;
                    if(currentUser){
                        userState[0][2]= true;
                        theImageWeAreLookingFor.setImageResource(R.drawable.circle);
                        theImageWeAreLookingFor.animate().setDuration(2000);
                        currentUser = false;
                    }
                    else{
                        userState[0][2]= false;
                        specialCondition[0][2]= true;
                        theImageWeAreLookingFor.setImageResource(R.drawable.star);
                        theImageWeAreLookingFor.animate().rotation(360f).setDuration(2000);
                        currentUser = true;
                    }}
                else{
                    Toast.makeText(MainActivity.this,"Already clicked",Toast.LENGTH_SHORT).show();
                    break;
                }
                break;
            case R.id.i3:
                if(combinations[1][0]==0){
                    combinations[1][0]=1;
                    counter++;
                    if(currentUser){
                        userState[1][0]= true;
                        theImageWeAreLookingFor.setImageResource(R.drawable.circle);
                        theImageWeAreLookingFor.animate().setDuration(2000);
                        currentUser = false;
                    }
                    else{
                        userState[1][0]= false;
                        specialCondition[1][0]= true;
                        theImageWeAreLookingFor.setImageResource(R.drawable.star);
                        theImageWeAreLookingFor.animate().rotation(360f).setDuration(2000);
                        currentUser = true;
                    }}
                else{
                    Toast.makeText(MainActivity.this,"Already clicked",Toast.LENGTH_SHORT).show();
                    break;
                }
                break;
            case R.id.i4:
                if(combinations[1][1]==0){
                    combinations[1][1]=1;
                    counter++;
                    if(currentUser){
                        userState[1][1]= true;
                        theImageWeAreLookingFor.setImageResource(R.drawable.circle);
                        theImageWeAreLookingFor.animate().setDuration(2000);
                        currentUser = false;
                    }
                    else{
                        userState[1][1]= false;
                        specialCondition[1][1]= true;
                        theImageWeAreLookingFor.setImageResource(R.drawable.star);
                        theImageWeAreLookingFor.animate().rotation(360f).setDuration(2000);
                        currentUser = true;
                    }}
                else{
                    Toast.makeText(MainActivity.this,"Already clicked",Toast.LENGTH_SHORT).show();
                    break;
                }
                break;
            case R.id.i5:
                if(combinations[1][2]==0){
                    combinations[1][2]=1;
                    counter++;
                    if(currentUser){
                        userState[1][2]= true;
                        theImageWeAreLookingFor.setImageResource(R.drawable.circle);
                        theImageWeAreLookingFor.animate().setDuration(2000);
                        currentUser = false;
                    }
                    else{
                        userState[1][2]= false;
                        specialCondition[1][2]= true;
                        theImageWeAreLookingFor.setImageResource(R.drawable.star);
                        theImageWeAreLookingFor.animate().rotation(360f).setDuration(2000);
                        currentUser = true;
                    }}
                else{
                    Toast.makeText(MainActivity.this,"Already clicked",Toast.LENGTH_SHORT).show();
                    break;
                }
                break;
            case R.id.i6:
                if(combinations[2][0]==0){
                combinations[2][0]=1;
                    counter++;
                    if(currentUser){
                    userState[2][0]= true;
                    theImageWeAreLookingFor.setImageResource(R.drawable.circle);
                    theImageWeAreLookingFor.animate().setDuration(2000);
                    currentUser = false;
                }
                else{
                    userState[2][0]= false;
                    specialCondition[2][0]= true;
                    theImageWeAreLookingFor.setImageResource(R.drawable.star);
                    theImageWeAreLookingFor.animate().rotation(360f).setDuration(2000);
                    currentUser = true;
                }}
            else{
                Toast.makeText(MainActivity.this,"Already clicked",Toast.LENGTH_SHORT).show();
                break;
            }
                break;
            case R.id.i7:
                if(combinations[2][1]==0){
                    combinations[2][1]=1;
                    counter++;
                    if(currentUser){
                        userState[2][1]= true;
                        theImageWeAreLookingFor.setImageResource(R.drawable.circle);
                        theImageWeAreLookingFor.animate().setDuration(2000);
                        currentUser = false;
                    }
                    else{
                        userState[2][1]= false;
                        specialCondition[2][1]= true;
                        theImageWeAreLookingFor.setImageResource(R.drawable.star);
                        theImageWeAreLookingFor.animate().rotation(360f).setDuration(2000);
                        currentUser = true;
                    }}
                else{
                    Toast.makeText(MainActivity.this,"Already clicked",Toast.LENGTH_SHORT).show();
                    break;
                }
                break;
            case R.id.i8:
                if(combinations[2][2]==0){
                    combinations[2][2]=1;
                    counter++;
                    if(currentUser){
                        userState[2][2]= true;
                        theImageWeAreLookingFor.setImageResource(R.drawable.circle);
                        theImageWeAreLookingFor.animate().setDuration(2000);
                        currentUser = false;
                    }
                    else{
                        userState[2][2]= false;
                        specialCondition[2][2]= true;
                        theImageWeAreLookingFor.setImageResource(R.drawable.star);
                        theImageWeAreLookingFor.animate().rotation(360f).setDuration(2000);
                        currentUser = true;
                    }}
                else{
                    Toast.makeText(MainActivity.this,"Already clicked",Toast.LENGTH_SHORT).show();
                    break;
                }
                break;
        }
        if ((winner() == 1) && (counter>=3) ) {
            //For circle
            if ((((userState[0][0]&&userState[0][1])&&(userState[0][2])))||(((userState[1][0]&&userState[1][1])&&(userState[1][2])))||(((userState[2][0]&&userState[2][1])&&(userState[2][2])))||(((userState[0][0]&&userState[1][0])&&(userState[2][0])))||(((userState[0][1]&&userState[2][1])&&(userState[1][1])))||(((userState[0][2]&&userState[2][2])&&(userState[1][2])))||(((userState[0][0]&&userState[2][2])&&(userState[1][1])))||(((userState[0][2]&&userState[1][1])&&(userState[2][0])))){
                Button restartButton = findViewById(R.id.restartButton);
                restartButton.setVisibility(view.VISIBLE);
                Button upadateText = findViewById(R.id.whoWon);
                upadateText.setVisibility(view.VISIBLE);
                upadateText.setText("Circle Won");
                conditionForDraw = true;

            }
            // Here is an error as this condition always becomes true as all the values are always false
            // Creating a special condition
            // For star
           //if(((((!userState[0][0])&&(!userState[0][1]))&&(!userState[0][2])))||((((!userState[1][0])&&(!userState[1][1]))&&(!userState[1][2])))||((((!userState[2][0])&&(!userState[2][1]))&&(!userState[2][2])))||((((!userState[0][0])&&(!userState[1][0]))&&(!userState[2][0])))||((((!userState[0][1])&&(!userState[2][1]))&&(!userState[1][1])))||((((!userState[0][2])&&(!userState[2][2]))&&(!userState[1][2])))||((((!userState[0][0])&&(!userState[2][2]))&&(!userState[1][1])))||((((!userState[1][2])&&(!userState[1][1]))&&(!userState[2][0])))) {
            if((((specialCondition[0][0]&&specialCondition[0][1])&&(specialCondition[0][2])))||(((specialCondition[1][0]&&specialCondition[1][1])&&(specialCondition[1][2])))||(((specialCondition[2][0]&&specialCondition[2][1])&&(specialCondition[2][2])))||(((specialCondition[0][0]&&specialCondition[1][0])&&(specialCondition[2][0])))||(((specialCondition[0][1]&&specialCondition[2][1])&&(specialCondition[1][1])))||(((specialCondition[0][2]&&specialCondition[2][2])&&(specialCondition[1][2])))||(((specialCondition[0][0]&&specialCondition[2][2])&&(specialCondition[1][1])))||(((specialCondition[0][2]&&specialCondition[1][1])&&(specialCondition[2][0])))){
               Button restartButton = findViewById(R.id.restartButton);
               restartButton.setVisibility(view.VISIBLE);
               Button upadateText = findViewById(R.id.whoWon);
               upadateText.setVisibility(view.VISIBLE);
               upadateText.setText("Star won.");
                conditionForDraw = true;
           }
            if(!conditionForDraw) {
                if (counter == 9) {
                    Button restartButton = findViewById(R.id.restartButton);
                    restartButton.setVisibility(view.VISIBLE);
                    Button upadateText = findViewById(R.id.whoWon);
                    upadateText.setVisibility(view.VISIBLE);
                    upadateText.setVisibility(view.VISIBLE);
                    upadateText.setText("Draw.");
                }
            }

        }


    }

    public  int winner(){

        if(((((combinations[0][0]==1))&&(combinations[0][2]==1))&&(combinations[0][1]==1))||((((combinations[1][0]==1))&&(combinations[1][2]==1))&&(combinations[1][1]==1))||((((combinations[2][0]==1))&&(combinations[2][2]==1))&&(combinations[2][1]==1))||((((combinations[0][0]==1))&&(combinations[1][1]==1))&&(combinations[2][2]==1))||((((combinations[0][2]==1))&&(combinations[1][1]==1))&&(combinations[2][0]==1))||((((combinations[0][0]==1))&&(combinations[1][0]==1))&&(combinations[2][0]==1))||((((combinations[0][1]==1))&&(combinations[1][1]==1))&&(combinations[2][1]==1))||((((combinations[0][2]==1))&&(combinations[1][2]==1))&&(combinations[2][2]==1))){
            return 1;
        }
        else {
            return 0;
        }
    }
    // Intent used to get
    public void restartActivity(View view){
        Intent mIntent = getIntent();
        finish();
        startActivity(mIntent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
